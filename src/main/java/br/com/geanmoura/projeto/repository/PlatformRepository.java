package br.com.geanmoura.projeto.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.geanmoura.projeto.entities.Platform;

public interface PlatformRepository extends JpaRepository<Platform, String> {
  
}
