package net.yeoubi.henesys.domain.repositories;

import net.yeoubi.henesys.domain.usecases.article.CreateArticle;
import net.yeoubi.henesys.domain.usecases.article.ScrapArticleList;

public interface ArticleRepository extends CreateArticle.ArticleRepository,
    ScrapArticleList.ArticleRepository {}
