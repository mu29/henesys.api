package net.yeoubi.henesys.entrypoints.rest.articles;

import net.yeoubi.henesys.domain.usecases.article.CreateArticleUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.CompletionStage;

@RestController
@RequestMapping("/articles")
public class ArticlesController {

    private CreateArticleUseCase createArticleUseCase;

    public ArticlesController(CreateArticleUseCase createArticleUseCase) {
        this.createArticleUseCase = createArticleUseCase;
    }

    @PostMapping
    CompletionStage<CreateArticleDto> createArticle(@RequestBody ArticleParams params) {
        return createArticleUseCase.execute(params, ArticleParams::fromParams, CreateArticleDto::toDto);
    }
}
