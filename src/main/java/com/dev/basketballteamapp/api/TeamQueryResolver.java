package com.dev.basketballteamapp.api;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.dev.basketballteamapp.entity.TeamEntity;
import com.dev.basketballteamapp.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TeamQueryResolver implements GraphQLQueryResolver {

    private final ITeamService teamService;

    @Autowired
    public TeamQueryResolver(ITeamService teamService) {
        this.teamService = teamService;
    }

    public List<TeamEntity> getAllTeam(){
        return teamService.getAllTeam();
    }

    public Optional<TeamEntity> getTeamById(Long id){
        return teamService.getTeamById(id);
    }
}
