package com.rpg.Projeto.Hunter.service;

import com.rpg.Projeto.Hunter.model.Monster;
import com.rpg.Projeto.Hunter.repository.MonsterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MonsterService {

    @Autowired
    private MonsterRepository monsterRepository;

    public Monster create(Monster monster) {
        return monsterRepository.save(monster);
    }

    public Monster getRandomMonster(String difficulty) {
        return monsterRepository.findRandomByDifficulty(difficulty);
    }

    public List<Monster> getAll() {
        return monsterRepository.findAll();
    }
}
