package com.dev.basketballteamapp.service;

import com.dev.basketballteamapp.dto.TeamDto;
import com.dev.basketballteamapp.entity.TeamEntity;

import java.util.List;
import java.util.Optional;

public interface ITeamService {

    TeamEntity createTeam(TeamDto teamDto);

    Optional<TeamEntity> getTeamById(Long id);

    List<TeamEntity> getAllTeam();
}
