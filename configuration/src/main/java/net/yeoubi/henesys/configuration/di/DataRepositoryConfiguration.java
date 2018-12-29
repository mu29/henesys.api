package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.dataproviders.repositories.ArticleDataRepository;
import net.yeoubi.henesys.dataproviders.sources.local.ArticleLocal;
import net.yeoubi.henesys.domain.repositories.ArticleRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataRepositoryConfiguration {

    @Bean
    public ArticleRepository articleDataRepository(ArticleLocal articleLocal) {
        return new ArticleDataRepository(articleLocal);
    }
}
