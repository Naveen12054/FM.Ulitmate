package com.football.manager.football_manager.model;

import com.football.manager.football_manager.model.Club;
import jakarta.persistence.*;
import lombok.Data;


@Entity
@Data
public class Manager {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;

    @OneToOne(mappedBy = "manager")
    private Club club;
}
