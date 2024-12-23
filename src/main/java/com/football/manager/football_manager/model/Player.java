package com.football.manager.football_manager.model;
import jakarta.persistence.*;
import lombok.Data;
@Entity
@Data
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String position;

    @ManyToOne
    private Club club;

    @ManyToOne
    private Nation nation;
}
