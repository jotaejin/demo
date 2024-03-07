package com.group.team.controller;

import com.group.team.request.TeamRequest;
import com.group.team.response.TeamResponse;
import com.group.team.service.TeamService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;
    @PostMapping("/team/save")
    public void saveTeam(@RequestBody TeamRequest teamRequest) {
        teamService.saveTeam(teamRequest);
    }

    @GetMapping("/team")
    public List<TeamResponse> getTeam() {
        return teamService.getTeam();
    }
}
