package com.dev.basketballteamapp.util;

import com.dev.basketballteamapp.dto.PlayerDto;
import com.dev.basketballteamapp.dto.TeamDto;
import com.dev.basketballteamapp.enums.Positions;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class UnitTestUtil {

    protected static final String DEFAULT_STRING = "Test String";
    protected static final Long DEFAULT_LONG = 1L;
    protected static final Date DEFAULT_DATE = new Date();
    protected static final Positions DEFAULT_POSITION = Positions.CENTER;
    protected static final List<PlayerDto>  DEFAULT_PLAYER_DTO_LIST = Arrays.asList(getPlayerDto());

    public static final PlayerDto getPlayerDto(){
        PlayerDto playerDto = new PlayerDto();
        playerDto.setCreateDate(DEFAULT_DATE);
        playerDto.setPosition(DEFAULT_POSITION);
        playerDto.setSurName(DEFAULT_STRING);
        playerDto.setName(DEFAULT_STRING);
        playerDto.setTeamId(DEFAULT_LONG);
        playerDto.setId(DEFAULT_LONG);
        return playerDto;
    }

    public static final TeamDto getTeamDto(){
        TeamDto teamDto = new TeamDto();
        teamDto.setId(DEFAULT_LONG);
        teamDto.setName(DEFAULT_STRING);
        teamDto.setLig(DEFAULT_STRING);
        teamDto.setCreateDate(DEFAULT_DATE);
        teamDto.setPlayers(DEFAULT_PLAYER_DTO_LIST);
        return teamDto;
    }
}
