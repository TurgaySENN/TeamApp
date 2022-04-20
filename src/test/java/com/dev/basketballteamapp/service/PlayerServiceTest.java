package com.dev.basketballteamapp.service;

import com.dev.basketballteamapp.entity.PlayerEntity;
import com.dev.basketballteamapp.repo.PlayerRepository;
import com.dev.basketballteamapp.util.PlayerTestUtil;
import com.dev.basketballteamapp.util.UnitTestUtil;
import graphql.GraphQLException;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(MockitoExtension.class)
public class PlayerServiceTest {

    @Mock
    private IPlayerService playerService;

    @Mock
    private PlayerRepository playerRepository;

    private PlayerEntity playerEntity = PlayerTestUtil.getPlayerEntity();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        playerService= new PlayerService(playerRepository);
    }

    @Test
    public void createPlayer() {
        Mockito.when(playerRepository.getByTeam(anyLong())).thenReturn(PlayerTestUtil.getPlayerEntityList());
        Mockito.when(playerRepository.save(any(PlayerEntity.class))).thenReturn(playerEntity);
        PlayerEntity response = playerService.createPlayer(UnitTestUtil.getPlayerDto());
        assertEquals(response,playerEntity);
    }

    @Test(expected = GraphQLException.class)
    public void givenOutOfPlayerLimit_CreatePlayer_ThenShuldThrow() throws  GraphQLException{
        Mockito.when(playerRepository.getByTeam(anyLong())).thenReturn(PlayerTestUtil.getPlayerEntityListForPlayerLimit());
       // Mockito.when(playerRepository.save(any(PlayerEntity.class))).thenReturn(playerEntity);
        PlayerEntity response = playerService.createPlayer(UnitTestUtil.getPlayerDto());
    }

    @Test
    public void deletePlayer() {
        Long response = playerService.deletePlayer(playerEntity.getId());
        assertEquals(response,playerEntity.getId());
    }
}