package net.yeoubi.henesys.local.database;

import net.yeoubi.henesys.local.entities.MenuEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuJpaRepository extends JpaRepository<MenuEntity, Long> {}
