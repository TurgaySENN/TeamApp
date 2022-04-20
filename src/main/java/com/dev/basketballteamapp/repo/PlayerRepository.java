package com.dev.basketballteamapp.repo;

import com.dev.basketballteamapp.entity.PlayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlayerRepository  extends JpaRepository<PlayerEntity, Long> {

    @Query("select p from PlayerEntity p where p.team.id =:teamId")
    List<PlayerEntity> getByTeam(Long teamId);
}
