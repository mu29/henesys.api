package net.yeoubi.henesys.domain.entities;

public class Article {

    private Integer id;

    private String title;

    private String content;

    public Article(Integer id, String title, String content) {
        this.id = id;
        this.title = title;
        this.content = content;
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
}
