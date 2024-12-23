package com.football.manager.football_manager.service;

import com.football.manager.football_manager.model.Club;
import com.football.manager.football_manager.repository.ClubRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClubService {
    @Autowired
    private ClubRepository clubRepository;

    public List<Club> getAllClubs() {
        return clubRepository.findAll();
    }

    public Club createClub(Club club) {
        return clubRepository.save(club);
    }
}
