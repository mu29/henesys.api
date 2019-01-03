package net.yeoubi.henesys.entrypoints.rest.articles;

import net.yeoubi.henesys.domain.usecases.article.CreateArticle;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletionStage;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    private CreateArticle createArticle;

    public ArticlesController(CreateArticle createArticle) {
        this.createArticle = createArticle;
    }

    @PostMapping
    CompletionStage<CreateArticleDto> createArticle(@RequestBody ArticleParams params) {
        return createArticle.execute(params, ArticleParams::fromParams, CreateArticleDto::toDto);
    }
}
