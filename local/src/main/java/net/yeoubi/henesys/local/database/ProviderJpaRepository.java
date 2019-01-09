package net.yeoubi.henesys.local.database;

import net.yeoubi.henesys.local.entities.ProviderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderJpaRepository extends JpaRepository<ProviderEntity, Long> {}
