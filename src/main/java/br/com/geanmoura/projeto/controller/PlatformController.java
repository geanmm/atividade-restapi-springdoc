package br.com.geanmoura.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.geanmoura.projeto.entities.Platform;
import br.com.geanmoura.projeto.service.PlatformService;
import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/platform")
public class PlatformController {
  @Autowired
  private PlatformService platformService;

  @GetMapping
  @Operation(summary = "Lista todas as plataformas")
  public List<Platform> getAll() {
    return platformService.getAll();
  }

  @GetMapping("/{id}")
  @Operation(summary = "Retorna a plataforma com base no ID")
  public Platform getById(@PathVariable String id) {
    return platformService.getById(id);
  }

  @PostMapping
  @Operation(summary = "Adiciona uma nova plataforma")
  public Platform addPlatform(@RequestBody Platform platform){
    return platformService.addPlatform(platform);
  }

  @PutMapping("/{id}")
  @Operation(summary = "Atualiza uma plataforma com base no ID")
  public Platform updatePlatform(@PathVariable String id, @RequestBody Platform platform) {
    return platformService.updatePlatform(id, platform);

  }

  @DeleteMapping("/{id}")
  @Operation(summary = "Deleta uma plataforma com base no ID")
  public void removePlatform(@PathVariable String id) {
    platformService.removePlatform(id);
  }
}
