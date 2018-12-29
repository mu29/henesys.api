package net.yeoubi.henesys.local;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan("net.yeoubi.henesys.local.entities")
@EnableJpaRepositories("net.yeoubi.henesys.local.database")
public class JpaConfig {}
