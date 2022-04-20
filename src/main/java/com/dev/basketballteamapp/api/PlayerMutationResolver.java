package com.dev.basketballteamapp.api;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.dev.basketballteamapp.dto.PlayerDto;
import com.dev.basketballteamapp.entity.PlayerEntity;
import com.dev.basketballteamapp.service.IPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PlayerMutationResolver implements GraphQLMutationResolver {

    private final IPlayerService playerService;

    @Autowired
    public PlayerMutationResolver(IPlayerService playerService) {
        this.playerService = playerService;
    }

    public PlayerEntity createPlayer(PlayerDto playerDto){
        return playerService.createPlayer(playerDto);
    }

    public void deletePlayer(Long id){
        playerService.deletePlayer(id);
    }

}
