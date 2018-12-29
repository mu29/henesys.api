package net.yeoubi.henesys.entrypoints.rest.articles;

import net.yeoubi.henesys.domain.entities.Article;

public class ArticleParams {

    private Integer id;

    private String title;

    private String content;

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public static Article fromParams(ArticleParams params) {
        return new Article(
            params.getId(),
            params.getTitle(),
            params.getContent()
        );
    }
}
