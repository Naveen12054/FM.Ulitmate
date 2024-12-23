package com.football.manager.football_manager.service;

import com.football.manager.football_manager.model.Nation;
import com.football.manager.football_manager.repository.NationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NationService {
    @Autowired
    private NationRepository nationRepository;

    public List<Nation> getAllNations() {
        return nationRepository.findAll();
    }

    public Nation createNation(Nation nation) {
        return nationRepository.save(nation);
    }
}
