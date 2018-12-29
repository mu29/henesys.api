package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.domain.usecases.article.CreateArticleUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UseCaseConfiguration {

    @Bean
    public CreateArticleUseCase createArticleUseCase(CreateArticleUseCase.ArticleRepository repository) {
        return new CreateArticleUseCase(repository);
    }
}
