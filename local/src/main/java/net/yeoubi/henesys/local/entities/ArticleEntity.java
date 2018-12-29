package net.yeoubi.henesys.local.entities;

import net.yeoubi.henesys.domain.entities.Article;

import javax.persistence.*;

@Entity
@Table(name = "articles")
public class ArticleEntity {

    @Id
    @GeneratedValue
    private Integer id;

    @Column
    private String title;

    @Column
    private String content;

    public ArticleEntity(Integer id, String title, String content) {
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

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public static ArticleEntity toEntity(Article article) {
        return new ArticleEntity(
            article.getId(),
            article.getTitle(),
            article.getContent()
        );
    }

    public static Article fromEntity(ArticleEntity article) {
        return new Article(
            article.getId(),
            article.getTitle(),
            article.getContent()
        );
    }
}
