package net.yeoubi.henesys.entrypoints.rest.articles;

import net.yeoubi.henesys.domain.entities.Article;

public class CreateArticleDto {

    private Integer id;

    private String title;

    private String content;

    CreateArticleDto(Integer id, String title, String content) {
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

    static CreateArticleDto toDto(Article article) {
        return new CreateArticleDto(
            article.getId(),
            article.getTitle(),
            article.getContent()
        );
    }
}
