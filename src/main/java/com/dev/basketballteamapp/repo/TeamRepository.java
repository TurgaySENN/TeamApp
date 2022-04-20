package com.dev.basketballteamapp.repo;

import com.dev.basketballteamapp.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
