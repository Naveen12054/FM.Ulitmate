package com.football.manager.football_manager.controller;

import com.football.manager.football_manager.model.Manager;
import com.football.manager.football_manager.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/managers")
public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @GetMapping
    public List<Manager> getAllManagers() {
        return managerService.getAllManagers();
    }

    @PostMapping
    public Manager addManager(@RequestBody Manager manager) {
        return managerService.createManager(manager);
    }
}
