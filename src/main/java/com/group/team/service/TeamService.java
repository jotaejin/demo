package com.group.team.service;

import com.group.team.domain.Team;
import com.group.team.repository.TeamRepository;
import com.group.team.request.TeamRequest;
import com.group.team.response.TeamResponse;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    @Transactional
    public void saveTeam(TeamRequest request) {
        teamRepository.save(Team.builder().
                name(request.getName())
                .managerName(request.getManager())
                .memberCount(request.getMemberCount())
                .build());
    }

    @Transactional
    public List<TeamResponse> getTeam() {
        return teamRepository.findAll().stream()
                .map(TeamResponse::new)
                .collect(Collectors.toList());
    }
}
