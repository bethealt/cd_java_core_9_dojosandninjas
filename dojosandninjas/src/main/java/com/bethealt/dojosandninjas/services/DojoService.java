package com.bethealt.dojosandninjas.services;
import com.bethealt.dojosandninjas.models.*;
import java.util.*;

import com.bethealt.dojosandninjas.repositories.DojoRepository;
import com.bethealt.dojosandninjas.repositories.NinjaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class DojoService {

    @Autowired
    DojoRepository dojoRepository;

    @Autowired 
    NinjaRepository ninjaRepository;

    //returns all the dojos
    public List<Dojo> allDojos() {
        return dojoRepository.findAll();
    }

    //creates a dojo
    public Dojo createDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    //retrieves a dojo
    public Dojo findDojo(Long id) {
        Optional<Dojo> optionalDojo = dojoRepository.findById(id);
        if(optionalDojo.isPresent()) {
            return optionalDojo.get();
        }
        else {
            return null;
        }
    }

    //updates a dojo
    public Dojo updateDojo(Dojo dojo) {
        return dojoRepository.save(dojo);
    }

    //deletes a dojo
    public void deleteDojo(Long id) {
        dojoRepository.deleteById(id);
    }

    //returns all ninjas
    public List<Ninja> allNinjas() {
        return ninjaRepository.findAll();
    }

    //creates a ninja
    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

    //retrieves a ninja
    public Ninja findNinja(Long id) {
        Optional<Ninja> optionalNinja = ninjaRepository.findById(id);
        if(optionalNinja.isPresent()) {
            return optionalNinja.get();
        }
        else {
            return null;
        }
    }
    
   //updates a ninja
   public Ninja updateNinja(Ninja ninja) {
       return ninjaRepository.save(ninja);
   }

   //deletes a ninja
   public void deleteNinja (Long id) {
       ninjaRepository.deleteById(id);
   }

}

