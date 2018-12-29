package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.domain.usecases.article.CreateArticleUseCase;
import net.yeoubi.henesys.entrypoints.rest.articles.ArticlesController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public ArticlesController articlesController(CreateArticleUseCase createArticleUseCase) {
        return new ArticlesController(createArticleUseCase);
    }
}
