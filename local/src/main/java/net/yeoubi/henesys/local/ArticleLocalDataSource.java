package net.yeoubi.henesys.local;

import net.yeoubi.henesys.dataproviders.sources.local.ArticleLocal;
import net.yeoubi.henesys.domain.entities.Article;
import net.yeoubi.henesys.local.database.ArticleJpaRepository;
import net.yeoubi.henesys.local.entities.ArticleEntity;

public class ArticleLocalDataSource implements ArticleLocal {

    private ArticleJpaRepository jpaRepository;

    public ArticleLocalDataSource(ArticleJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Article create(Article article) {
        ArticleEntity entity = jpaRepository.save(ArticleEntity.toEntity(article));
        return ArticleEntity.fromEntity(entity);
    }
}
