package net.yeoubi.henesys.domain.entities;

import java.util.ArrayList;
import java.util.Collection;

public final class Menu {

    private Integer id;

    private String name;

    private Collection<ProviderMenu> providerMenus;

    public Menu(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.providerMenus = new ArrayList<>();
    }

    public Menu(Integer id, String name, Collection<ProviderMenu> providerMenus) {
        this.id = id;
        this.name = name;
        this.providerMenus = providerMenus;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<ProviderMenu> getProviderMenus() {
        return providerMenus;
    }
}
