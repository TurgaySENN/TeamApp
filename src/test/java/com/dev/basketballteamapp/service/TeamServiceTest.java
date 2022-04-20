import com.dev.basketballteamapp.entity.PlayerEntity;
import com.dev.basketballteamapp.entity.TeamEntity;
import com.dev.basketballteamapp.repo.TeamRepository;
import com.dev.basketballteamapp.service.ITeamService;
import com.dev.basketballteamapp.service.TeamService;
import com.dev.basketballteamapp.util.PlayerTestUtil;
import com.dev.basketballteamapp.util.TeamTestUtil;
import com.dev.basketballteamapp.util.UnitTestUtil;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
@ExtendWith(MockitoExtension.class)
public class TeamServiceTest {

    @Mock
    private ITeamService teamService;

    @Mock
    private TeamRepository teamRepository;

    private TeamEntity teamEntity = TeamTestUtil.getTeamEntity();
    private List<TeamEntity> teamEntityList = TeamTestUtil.getTeamEntityList();
    private Optional<TeamEntity> teamEntityOptional = TeamTestUtil.getTeamEntityOptional();

    @Before
    public void setUp(){
        MockitoAnnotations.initMocks(this);
        teamService= new TeamService(teamRepository);
    }

    @Test
    public void createTeam(){
        Mockito.when(teamRepository.save(any(TeamEntity.class))).thenReturn(teamEntity);
        TeamEntity response = teamService.createTeam(UnitTestUtil.getTeamDto());
        assertEquals(response,teamEntity);

    }

    @Test
    public void getAllTeam(){
        Mockito.when(teamRepository.findAll()).thenReturn(teamEntityList);
        List<TeamEntity> response = teamService.getAllTeam();
        assertEquals(response,teamEntityList);
    }

    @Test
    public void getTeamById() {
        Mockito.when(teamRepository.findById(anyLong())).thenReturn(teamEntityOptional);
        Optional<TeamEntity> response = teamService.getTeamById(teamEntity.getId());
        assertEquals(response, teamEntityOptional);
    }
}