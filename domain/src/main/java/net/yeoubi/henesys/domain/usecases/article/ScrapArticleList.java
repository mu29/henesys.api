package net.yeoubi.henesys.domain.usecases.article;

import net.yeoubi.henesys.domain.usecases.UseCase;

public final class ScrapArticleList extends UseCase<Integer, Integer> {

    private final ArticleRepository repository;

    public ScrapArticleList(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Integer buildUseCase(Integer page) {
        return repository.scrapArticleList(page);
    }

    public interface ArticleRepository {
        Integer scrapArticleList(Integer page);
    }
}
