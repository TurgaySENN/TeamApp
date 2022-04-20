package com.dev.basketballteamapp.util;

import com.dev.basketballteamapp.entity.TeamEntity;
import com.dev.basketballteamapp.mapper.TeamMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TeamTestUtil {

    public static TeamEntity getTeamEntity(){
        return TeamMapper.dtoToEntity(UnitTestUtil.getTeamDto());
    }
    public static List<TeamEntity> getTeamEntityList(){
        List<TeamEntity> teamEntityList = new ArrayList<>();
        teamEntityList.add(TeamMapper.dtoToEntity(UnitTestUtil.getTeamDto()));
        return teamEntityList;
    }
    public static Optional<TeamEntity> getTeamEntityOptional(){
        List<TeamEntity> teamEntityList = new ArrayList<>();
        teamEntityList.add(TeamMapper.dtoToEntity(UnitTestUtil.getTeamDto()));
        return teamEntityList.stream().findFirst();
    }
}
