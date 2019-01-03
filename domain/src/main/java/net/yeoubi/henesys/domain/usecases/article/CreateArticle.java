package net.yeoubi.henesys.domain.usecases.article;

import net.yeoubi.henesys.domain.entities.Article;
import net.yeoubi.henesys.domain.usecases.UseCase;

public final class CreateArticle extends UseCase<Article, Article> {

    private final ArticleRepository repository;

    public CreateArticle(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Article buildUseCase(Article article) {
        return repository.createArticle(article);
    }

    public interface ArticleRepository {
        Article createArticle(Article article);
    }
}
