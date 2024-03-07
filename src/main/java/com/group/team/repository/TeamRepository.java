package com.group.team.repository;

import com.group.team.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;


public interface TeamRepository extends JpaRepository<Team,Long> {
}
