package net.yeoubi.henesys.domain.usecases.article;

import net.yeoubi.henesys.domain.usecases.UseCase;

public final class ScrapInvenArticleList extends UseCase<Integer, Integer> {

    private final ArticleRepository repository;

    public ScrapInvenArticleList(ArticleRepository repository) {
        this.repository = repository;
    }

    @Override
    protected Integer buildUseCase(Integer page) {
        return repository.scrapInvenArticleList(page);
    }

    public interface ArticleRepository {
        Integer scrapInvenArticleList(Integer page);
    }
}
