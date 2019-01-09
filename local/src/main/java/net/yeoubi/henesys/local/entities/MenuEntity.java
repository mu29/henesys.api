package net.yeoubi.henesys.local.entities;

import net.yeoubi.henesys.domain.entities.Menu;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Entity
@Table(name = "menus")
public class MenuEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String name;

    @OneToMany(cascade=CascadeType.ALL)
    private Collection<ProviderMenuEntity> providerMenus;

    public MenuEntity(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.providerMenus = new ArrayList<>();
    }

    public MenuEntity(Integer id, String name, Collection<ProviderMenuEntity> providerMenus) {
        this.id = id;
        this.name = name;
        this.providerMenus = providerMenus;
    }

    public static MenuEntity toEntity(Menu menu) {
        return new MenuEntity(
            menu.getId(),
            menu.getName(),
            menu.getProviderMenus().stream()
                .map(ProviderMenuEntity::toEntity)
                .collect(Collectors.toList())
        );
    }

    public static Menu fromEntity(MenuEntity menu) {
        return new Menu(
            menu.id,
            menu.name,
            menu.providerMenus.stream()
                .map(ProviderMenuEntity::fromEntity)
                .collect(Collectors.toList())
        );
    }
}
