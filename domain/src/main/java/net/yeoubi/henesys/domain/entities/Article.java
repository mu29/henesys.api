package net.yeoubi.henesys.domain.entities;

public final class Article {

    private Integer id;

    private String title;

    private String content;

    private Provider provider;

    private Menu menu;

    private User user;

    private String userName;

    private String sourceId;

    private String sourceUrl;

    public Article(
        Integer id,
        String title,
        String content,
        Provider provider,
        Menu menu,
        User user,
        String userName,
        String sourceId,
        String sourceUrl
    ) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.provider = provider;
        this.menu = menu;
        this.user = user;
        this.userName = userName;
        this.sourceId = sourceId;
        this.sourceUrl = sourceUrl;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public Provider getProvider() {
        return provider;
    }

    public Menu getMenu() {
        return menu;
    }

    public User getUser() {
        return user;
    }

    public String getUserName() {
        return userName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }
}
