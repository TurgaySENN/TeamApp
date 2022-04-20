package com.dev.basketballteamapp.service;

import com.dev.basketballteamapp.dto.PlayerDto;
import com.dev.basketballteamapp.entity.PlayerEntity;
import com.dev.basketballteamapp.mapper.PlayerMapper;
import com.dev.basketballteamapp.repo.PlayerRepository;
import graphql.GraphQLException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class PlayerService implements IPlayerService {

    private final PlayerRepository playerRepository;

    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    @Override
    @Transactional
    public PlayerEntity createPlayer(PlayerDto playerDto){
        List<PlayerEntity> playerList = playerRepository.getByTeam(playerDto.getTeamId());
        if(playerList.size() > 11){
            throw new GraphQLException("Takım maximum oyuncu sınırını doldurmuştur, yeni oyuncu kayıt edilemez!");
        }else{
            return playerRepository.save(PlayerMapper.dtoToEntity(playerDto));
        }
    }
    @Override
    @Transactional
    public Long deletePlayer(Long id){
        playerRepository.deleteById(id);
        return id;
    }
}
