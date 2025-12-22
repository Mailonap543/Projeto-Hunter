package com.rpg.Projeto.Hunter.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "monsters")
public class Monster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(length = 1000)
    private String lore;

    @Enumerated(EnumType.STRING)
    private QuestionCategory weakness;

    private String difficulty;

    private String imageUrl;
}