package net.yeoubi.henesys.local.entities;

import net.yeoubi.henesys.domain.entities.ProviderMenu;

import javax.persistence.*;

@Entity
@Table(name = "provider_menus")
public class ProviderMenuEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @ManyToOne
    private ProviderEntity provider;

    @ManyToOne
    private MenuEntity menu;

    public ProviderMenuEntity(Integer id, ProviderEntity provider, MenuEntity menu) {
        this.id = id;
        this.menu = menu;
        this.provider = provider;
    }

    public static ProviderMenuEntity toEntity(ProviderMenu providerMenu) {
        return new ProviderMenuEntity(
            providerMenu.getId(),
            ProviderEntity.toEntity(providerMenu.getProvider()),
            MenuEntity.toEntity(providerMenu.getMenu())
        );
    }

    public static ProviderMenu fromEntity(ProviderMenuEntity providerMenu) {
        return new ProviderMenu(
            providerMenu.id,
            ProviderEntity.fromEntity(providerMenu.provider),
            MenuEntity.fromEntity(providerMenu.menu)
        );
    }
}
