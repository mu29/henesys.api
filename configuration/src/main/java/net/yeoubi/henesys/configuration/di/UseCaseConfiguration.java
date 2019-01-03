package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.domain.usecases.article.CreateArticle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public CreateArticle createArticle(CreateArticle.ArticleRepository repository) {
        return new CreateArticle(repository);
    }
}
