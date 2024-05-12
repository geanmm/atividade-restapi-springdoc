package br.com.geanmoura.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.geanmoura.projeto.entities.Game;

@Repository
public interface GameRepository extends JpaRepository<Game, String>{
}
