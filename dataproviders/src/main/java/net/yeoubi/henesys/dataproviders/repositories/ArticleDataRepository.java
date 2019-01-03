package net.yeoubi.henesys.dataproviders.repositories;

import net.yeoubi.henesys.dataproviders.sources.local.ArticleLocal;
import net.yeoubi.henesys.dataproviders.sources.remote.ArticleRemote;
import net.yeoubi.henesys.domain.entities.Article;
import net.yeoubi.henesys.domain.repositories.ArticleRepository;

import java.util.List;

public final class ArticleDataRepository implements ArticleRepository {

    private final ArticleLocal localDataSource;

    private final ArticleRemote remoteDataSource;

    public ArticleDataRepository(ArticleLocal localDataSource, ArticleRemote remoteDataSource) {
        this.localDataSource = localDataSource;
        this.remoteDataSource = remoteDataSource;
    }

    @Override
    public Article createArticle(Article article) {
        return localDataSource.create(article);
    }

    @Override
    public Integer scrapInvenArticleList(Integer page) {
        List<Article> articles =  remoteDataSource.scrapInvenArticleList(page);
        articles.forEach(localDataSource::create);

        return articles.size();
    }
}
