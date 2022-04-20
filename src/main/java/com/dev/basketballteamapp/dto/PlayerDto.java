package com.dev.basketballteamapp.dto;
import com.dev.basketballteamapp.enums.Positions;
import lombok.Data;

@Data
public class PlayerDto extends BaseDto {
    private String surName;
    private Positions position;
    private Long teamId;
}
