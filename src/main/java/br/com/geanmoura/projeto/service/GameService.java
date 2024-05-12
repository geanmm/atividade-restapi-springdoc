package br.com.geanmoura.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.geanmoura.projeto.entities.Game;
import br.com.geanmoura.projeto.repository.GameRepository;

@Service
public class GameService {
  
  @Autowired
  private GameRepository gameRepository;

  public List<Game> getAll(){
    return gameRepository.findAll();
  }

  public Game getById(String id){
    return gameRepository.findById(id).orElse(null);
  }

  public Game addGame(Game game){
    return gameRepository.save(game);
  }

  public Game updateGame(String id, Game game){
    Game updatedGame = gameRepository.findById(id).orElse(null);

    if(updatedGame != null){
      updatedGame.setName(game.getName());
      updatedGame.setPlatforms(game.getPlatforms());
      return gameRepository.save(updatedGame);
    }
    return null;
  }

  public boolean removeGame(String id){
    Game removedGame = gameRepository.findById(id).orElse(null);
    if(removedGame != null){
      gameRepository.delete(removedGame);
      return true;
    }
    return false;
  }
  
}
