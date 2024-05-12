package br.com.geanmoura.projeto.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "game")
public class Game {
  @Id
  @GeneratedValue(strategy = GenerationType.UUID)
  @Column(name = "game_id")
  private String id;

  @Column(name = "game_name", nullable = false)
  private String name;

  @ManyToMany(mappedBy = "games")
  @JsonIgnoreProperties("games")
  private List<Platform> platforms;

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

  public List<Platform> getPlatforms() {
    return platforms;
  }

  public void setPlatforms(List<Platform> platforms) {
    this.platforms = platforms;
  }
  
  
}
