package com.rpg.Projeto.Hunter.controller;

import com.rpg.Projeto.Hunter.model.Monster;
import com.rpg.Projeto.Hunter.service.MonsterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/monsters")
@CrossOrigin(origins = "*")
public class MonsterController {

    @Autowired
    private MonsterService monsterService;

    @PostMapping
    public ResponseEntity<Monster> create(@RequestBody Monster monster) {
        return ResponseEntity.ok(monsterService.create(monster));
    }

    @GetMapping("/random")
    public ResponseEntity<Monster> getRandom(@RequestParam String difficulty) {
        Monster m = monsterService.getRandomMonster(difficulty);
        return m != null ? ResponseEntity.ok(m) : ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<Monster>> getAll() {
        return ResponseEntity.ok(monsterService.getAll());
    }
}