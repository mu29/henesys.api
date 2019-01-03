package net.yeoubi.henesys.remote;

import net.yeoubi.henesys.dataproviders.sources.remote.ArticleRemote;
import net.yeoubi.henesys.domain.entities.Article;

import java.util.List;

public final class ArticleRemoteDataSource implements ArticleRemote {

    private final String INVEN_ENDPOINT = "http://m.inven.co.kr/board/powerbbs.php";

    @Override
    public List<Article> scrapInvenArticleList(Integer page) {
        return null;
    }
}
