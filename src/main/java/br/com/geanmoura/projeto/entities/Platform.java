package br.com.geanmoura.projeto.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "platform")
public class Platform {
  
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "platform_id")
  private String id;

  @Column(name = "platform_name", nullable = false)
  private String name;

  @ManyToMany
  @JoinTable(
    name = "platform_game",
    joinColumns = @JoinColumn(name = "platform_id"),
    inverseJoinColumns = @JoinColumn(name = "game_id")
  )
  @JsonIgnoreProperties("platforms")
  private List<Game> games;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Game> getGames() {
    return games;
  }

  public void setGames(List<Game> games) {
    this.games = games;
  }

  
  
}
