package com.dev.basketballteamapp.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dev.basketballteamapp.dto.TeamDto;
import com.dev.basketballteamapp.entity.TeamEntity;
import com.dev.basketballteamapp.service.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeamMutationResolver implements GraphQLMutationResolver {

    private final ITeamService teamService;
    @Autowired
    public TeamMutationResolver(ITeamService teamService) {
        this.teamService = teamService;
    }

    public TeamEntity createTeam(TeamDto teamDto){
        return teamService.createTeam(teamDto);
    }
}
