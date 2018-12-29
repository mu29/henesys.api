package net.yeoubi.henesys.configuration.di;

import net.yeoubi.henesys.dataproviders.sources.local.ArticleLocal;
import net.yeoubi.henesys.local.ArticleLocalDataSource;
import net.yeoubi.henesys.local.database.ArticleJpaRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LocalDataSourceConfiguration {

    @Bean
    public ArticleLocal articleLocalDataSource(ArticleJpaRepository articleJpaRepository) {
        return new ArticleLocalDataSource(articleJpaRepository);
    }
}
