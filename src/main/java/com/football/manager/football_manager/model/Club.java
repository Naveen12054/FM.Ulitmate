package com.football.manager.football_manager.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Club {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @ManyToOne
    private Nation nation;

    @OneToOne
    private Manager manager;

    @OneToMany(mappedBy = "club", cascade = CascadeType.ALL)
    private List<Player> players;
}
