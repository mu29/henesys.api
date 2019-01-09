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

    @ManyToOne
    @JoinColumn
    private ProviderEntity provider;

    @ManyToOne
    private MenuEntity menu;

    @ManyToOne
    private UserEntity user;

    @Column
    private String userName;

    @Column
    private String sourceId;

    @Column
    private String sourceUrl;

    public ArticleEntity(
        Integer id,
        String title,
        String content,
        ProviderEntity provider,
        MenuEntity menu,
        UserEntity user,
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

    public static ArticleEntity toEntity(Article article) {
        return new ArticleEntity(
            article.getId(),
            article.getTitle(),
            article.getContent(),
            ProviderEntity.toEntity(article.getProvider()),
            MenuEntity.toEntity(article.getMenu()),
            UserEntity.toEntity(article.getUser()),
            article.getUserName(),
            article.getSourceId(),
            article.getSourceUrl()
        );
    }

    public static Article fromEntity(ArticleEntity article) {
        return new Article(
            article.id,
            article.title,
            article.content,
            ProviderEntity.fromEntity(article.provider),
            MenuEntity.fromEntity(article.menu),
            UserEntity.fromEntity(article.user),
            article.userName,
            article.sourceId,
            article.sourceUrl
        );
    }
}
