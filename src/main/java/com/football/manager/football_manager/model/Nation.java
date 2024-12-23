package com.football.manager.football_manager.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Entity
@Data
public class Nation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToMany(mappedBy = "nation", cascade = CascadeType.ALL)
    private List<Club> clubs;

    @OneToMany(mappedBy = "nation", cascade = CascadeType.ALL)
    private List<Player> players;
}
