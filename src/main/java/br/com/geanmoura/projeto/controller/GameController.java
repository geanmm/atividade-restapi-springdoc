package br.com.geanmoura.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.geanmoura.projeto.entities.Game;
import br.com.geanmoura.projeto.service.GameService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/game")
public class GameController {

  @Autowired
  private GameService gameService;

	@GetMapping
	@Operation(summary = "Lista todas os jogos")
	public List<Game> getAll(){
		return gameService.getAll();
	}

  @GetMapping("/{id}")
	@Operation(summary = "Retorna o jogo com base no ID")
	public Game getById(@PathVariable String id) {
		return gameService.getById(id);
	}

	@PostMapping
	@Operation(summary = "Adiciona um novo jogo")
	public Game addGame(@RequestBody Game game) {
		return gameService.addGame(game);
	}

  @PutMapping("/{id}")
	@Operation(summary = "Atualiza um jogo com base no ID")
	public Game updateGame(@PathVariable String id, @RequestBody Game game) {
		return gameService.updateGame(id, game);
	}

	@DeleteMapping("/{id}")
	@Operation(summary = "Deleta um jogo com base no ID")
	public Boolean deleteGame(@PathVariable String id) {
	 return gameService.removeGame(id);
	}
}
