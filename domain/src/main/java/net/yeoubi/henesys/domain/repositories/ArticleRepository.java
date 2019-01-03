package net.yeoubi.henesys.domain.repositories;

import net.yeoubi.henesys.domain.usecases.article.CreateArticle;
import net.yeoubi.henesys.domain.usecases.article.ScrapInvenArticleList;

public interface ArticleRepository extends CreateArticle.ArticleRepository,
    ScrapInvenArticleList.ArticleRepository {}
