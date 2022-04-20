package com.dev.basketballteamapp.mapper;

import com.dev.basketballteamapp.dto.PlayerDto;
import com.dev.basketballteamapp.entity.PlayerEntity;
import org.modelmapper.ModelMapper;

import java.util.Date;

public class PlayerMapper {
    private static ModelMapper mapper = new ModelMapper();
    public static PlayerEntity dtoToEntity(PlayerDto playerDto){
        playerDto.setCreateDate(new Date());
        return mapper.map(playerDto, PlayerEntity.class);
    }

    public static PlayerDto EntityToDto(PlayerEntity player){
        return mapper.map(player, PlayerDto.class);
    }
}
