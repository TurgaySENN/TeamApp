package com.dev.basketballteamapp.dto;

import lombok.Data;

import java.util.List;

@Data
public class TeamDto extends BaseDto {
    private String lig;
    private List<PlayerDto> players;
}
