package net.yeoubi.henesys.local.database;

import net.yeoubi.henesys.local.entities.ArticleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleJpaRepository extends JpaRepository<ArticleEntity, Long> {}
