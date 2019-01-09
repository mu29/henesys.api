package net.yeoubi.henesys.domain.entities;

import java.util.ArrayList;
import java.util.Collection;

public final class User {

    private Integer id;

    private String token;

    private String email;

    private String name;

    private Collection<Article> articles;

    public User(
        Integer id,
        String token,
        String email,
        String name
    ) {
        this.id = id;
        this.token = token;
        this.email = email;
        this.name = name;
        this.articles = new ArrayList<>();
    }

    public User(
        Integer id,
        String token,
        String email,
        String name,
        Collection<Article> articles
    ) {
        this.id = id;
        this.token = token;
        this.email = email;
        this.name = name;
        this.articles = articles;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public Collection<Article> getArticles() {
        return articles;
    }

    public void setArticles(Collection<Article> articles) {
        this.articles = articles;
    }
}
