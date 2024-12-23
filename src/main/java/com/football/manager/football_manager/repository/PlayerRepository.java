package com.football.manager.football_manager.repository;

import com.football.manager.football_manager.model.Player;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlayerRepository extends JpaRepository<Player, Long> {}
