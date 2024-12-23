package com.football.manager.football_manager.controller;

import com.football.manager.football_manager.model.Nation;
import com.football.manager.football_manager.service.NationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/nations")
public class NationController {
    @Autowired
    private NationService nationService;

    @GetMapping
    public List<Nation> getAllNations() {
        return nationService.getAllNations();
    }

    @PostMapping
    public Nation addNation(@RequestBody Nation nation) {
        return nationService.createNation(nation);
    }
}
