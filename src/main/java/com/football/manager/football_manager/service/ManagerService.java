package com.football.manager.football_manager.service;

import com.football.manager.football_manager.model.Manager;
import com.football.manager.football_manager.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {
    @Autowired
    private ManagerRepository managerRepository;

    public List<Manager> getAllManagers() {
        return managerRepository.findAll();
    }

    public Manager createManager(Manager manager) {
        return managerRepository.save(manager);
    }
}
