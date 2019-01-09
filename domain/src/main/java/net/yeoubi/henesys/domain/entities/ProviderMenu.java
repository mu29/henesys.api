package net.yeoubi.henesys.domain.entities;

public final class ProviderMenu {

    private Integer id;

    private Provider provider;

    private Menu menu;

    public ProviderMenu(Integer id, Provider provider, Menu menu) {
        this.id = id;
        this.provider = provider;
        this.menu = menu;
    }

    public Integer getId() {
        return id;
    }

    public Provider getProvider() {
        return provider;
    }

    public Menu getMenu() {
        return menu;
    }
}
