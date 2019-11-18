package com.shaizankhan.petclinic.services;

import com.shaizankhan.petclinic.model.Owner;

import java.util.Set;

/**
 * @author Shaizan.Khan
 */
public interface OwnerService {
    Owner findById(Long id);
    Owner save(Owner owner);
    Set<Owner> findAll();
    Owner findByLastName();
}
