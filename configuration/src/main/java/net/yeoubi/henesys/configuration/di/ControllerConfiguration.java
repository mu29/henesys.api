package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.domain.usecases.article.CreateArticle;
import net.yeoubi.henesys.entrypoints.rest.articles.ArticlesController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ControllerConfiguration {

    @Bean
    public ArticlesController articlesController(CreateArticle createArticle) {
        return new ArticlesController(createArticle);
    }
}
