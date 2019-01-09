package net.yeoubi.henesys.local.entities;

import net.yeoubi.henesys.domain.entities.Provider;

import javax.persistence.*;
import java.util.Collection;
import java.util.stream.Collectors;

@Entity
@Table(name = "providers")
public class ProviderEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    private Collection<ProviderMenuEntity> providerMenus;

    public ProviderEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProviderEntity(Integer id, String name, Collection<ProviderMenuEntity> providerMenus) {
        this.id = id;
        this.name = name;
        this.providerMenus = providerMenus;
    }

    public static ProviderEntity toEntity(Provider provider) {
        return new ProviderEntity(
            provider.getId(),
            provider.getName(),
            provider.getProviderMenus().stream()
                .map(ProviderMenuEntity::toEntity)
                .collect(Collectors.toList())
        );
    }

    public static Provider fromEntity(ProviderEntity provider) {
        return new Provider(
            provider.id,
            provider.name,
            provider.providerMenus.stream()
                .map(ProviderMenuEntity::fromEntity)
                .collect(Collectors.toList())
        );
    }
}
