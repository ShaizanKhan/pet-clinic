package com.shaizankhan.petclinic.services;

import com.shaizankhan.petclinic.model.Vet;

import java.util.Set;

/**
 * @author Shaizan.Khan
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
