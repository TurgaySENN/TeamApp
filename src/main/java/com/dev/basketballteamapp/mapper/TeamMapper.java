package com.dev.basketballteamapp.mapper;

import com.dev.basketballteamapp.dto.TeamDto;
import com.dev.basketballteamapp.entity.TeamEntity;
import org.modelmapper.ModelMapper;

import java.util.Date;
public class TeamMapper {
    private static ModelMapper mapper = new ModelMapper();
    public static TeamEntity dtoToEntity(TeamDto teamDto){
        teamDto.setCreateDate(new Date());
        return mapper.map(teamDto, TeamEntity.class);
    }

    public static TeamDto EntityToDto(TeamEntity team){
        return mapper.map(team, TeamDto.class);
    }
}
