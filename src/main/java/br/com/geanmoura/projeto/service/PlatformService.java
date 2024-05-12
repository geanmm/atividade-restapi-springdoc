package br.com.geanmoura.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.geanmoura.projeto.entities.Platform;
import br.com.geanmoura.projeto.repository.PlatformRepository;

@Service
public class PlatformService {
  @Autowired
  private PlatformRepository platformRepository;

  public List<Platform> getAll(){
    return platformRepository.findAll();
  }


  public Platform getById(String id){
    return platformRepository.findById(id).get();
  }

  public Platform addPlatform(Platform platform){
    return platformRepository.save(platform);
  }

  public Platform updatePlatform(String id, Platform platform){
    Platform updatedPlatform = platformRepository.findById(id).get();
    if(updatedPlatform != null){
      updatedPlatform.setName(platform.getName());
      return platformRepository.save(updatedPlatform);
    }
      return null;
  }

  public boolean removePlatform(String id){
    Platform deletedPlatform = platformRepository.findById(id).get();
    if(deletedPlatform != null){
      platformRepository.deleteById(id);
      return true;
    }
      return false;
  }
}
