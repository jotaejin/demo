package com.group.team.response;

import com.group.team.domain.Team;
import lombok.Data;

@Data
public class TeamResponse {
    private String name;
    private String manager;
    private long memberCount;

    public TeamResponse(Team team) {
        this.name = team.getName();
        this.manager = team.getManagerName();
        this.memberCount = team.getMemberCount();
    }
}
