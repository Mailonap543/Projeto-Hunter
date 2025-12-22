package com.rpg.Projeto.Hunter.repository;

import com.rpg.Projeto.Hunter.model.Monster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MonsterRepository extends JpaRepository<Monster, Long> {

    List<Monster> findByDifficulty(String difficulty);

    @Query(value = "SELECT * FROM monsters WHERE difficulty = :difficulty ORDER BY RAND() LIMIT 1", nativeQuery = true)
    Monster findRandomByDifficulty(String difficulty);
}