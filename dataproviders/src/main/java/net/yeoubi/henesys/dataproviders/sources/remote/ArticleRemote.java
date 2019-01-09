package net.yeoubi.henesys.dataproviders.sources.remote;

import net.yeoubi.henesys.domain.entities.Article;

import java.util.List;

public interface ArticleRemote {

    List<Article> scrapArticleList(Integer page);
}
