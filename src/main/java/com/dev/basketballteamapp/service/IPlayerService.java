package com.dev.basketballteamapp.service;

import com.dev.basketballteamapp.dto.PlayerDto;
import com.dev.basketballteamapp.entity.PlayerEntity;

import javax.transaction.Transactional;

public interface IPlayerService {
    PlayerEntity createPlayer(PlayerDto playerDto);

    @Transactional
    Long deletePlayer(Long id);
}
