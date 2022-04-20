package com.dev.basketballteamapp.service;

import com.dev.basketballteamapp.dto.TeamDto;
import com.dev.basketballteamapp.entity.TeamEntity;
import com.dev.basketballteamapp.mapper.TeamMapper;
import com.dev.basketballteamapp.repo.PlayerRepository;
import com.dev.basketballteamapp.repo.TeamRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TeamService implements ITeamService {

    private final TeamRepository teamRepository;
    @Override
    @Transactional
    public TeamEntity createTeam(TeamDto teamDto){
        return teamRepository.save(TeamMapper.dtoToEntity(teamDto));
    }

    @Override
    public List<TeamEntity> getAllTeam(){
        return teamRepository.findAll();
    }

    @Override
    public Optional<TeamEntity> getTeamById(Long id){
        return teamRepository.findById(id);
    }
}
