package com.dev.basketballteamapp.util;

import com.dev.basketballteamapp.entity.PlayerEntity;
import com.dev.basketballteamapp.mapper.PlayerMapper;

import java.util.ArrayList;
import java.util.List;

public class PlayerTestUtil {

    public static PlayerEntity getPlayerEntity(){
        return PlayerMapper.dtoToEntity(UnitTestUtil.getPlayerDto());
    }
    public static List<PlayerEntity> getPlayerEntityList(){
        List<PlayerEntity> playerEntityList = new ArrayList<>();
        playerEntityList.add(PlayerMapper.dtoToEntity(UnitTestUtil.getPlayerDto()));
        return playerEntityList;
    }
    public static List<PlayerEntity> getPlayerEntityListForPlayerLimit(){
        List<PlayerEntity> playerEntityList = new ArrayList<>();
        while(playerEntityList.size() < 12){
            playerEntityList.add(PlayerMapper.dtoToEntity(UnitTestUtil.getPlayerDto()));
        }
        return playerEntityList;
    }
}
