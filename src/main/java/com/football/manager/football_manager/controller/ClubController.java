package com.football.manager.football_manager.controller;

import com.football.manager.football_manager.model.Club;
import com.football.manager.football_manager.service.ClubService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clubs")
public class ClubController {
    @Autowired
    private ClubService clubService;

    @GetMapping
    public List<Club> getAllClubs() {
        return clubService.getAllClubs();
    }

    @PostMapping
    public Club addClub(@RequestBody Club club) {
        return clubService.createClub(club);
    }
}
