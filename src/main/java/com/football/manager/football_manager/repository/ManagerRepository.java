package com.football.manager.football_manager.repository;

import com.football.manager.football_manager.model.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {}
