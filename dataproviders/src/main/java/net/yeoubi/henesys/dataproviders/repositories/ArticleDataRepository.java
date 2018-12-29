package net.yeoubi.henesys.dataproviders.repositories;

import net.yeoubi.henesys.dataproviders.sources.local.ArticleLocal;
import net.yeoubi.henesys.domain.entities.Article;
import net.yeoubi.henesys.domain.repositories.ArticleRepository;

public class ArticleDataRepository implements ArticleRepository {

    private ArticleLocal localDataSource;

    public ArticleDataRepository(ArticleLocal localDataSource) {
        this.localDataSource = localDataSource;
    }

    @Override
    public Article createArticle(Article article) {
        return localDataSource.create(article);
    }
}
