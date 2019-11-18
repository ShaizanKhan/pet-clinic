package com.shaizankhan.petclinic.services;

import com.shaizankhan.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Shaizan.Khan
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
