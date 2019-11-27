package com.shaizankhan.petclinic.repositories;

import com.shaizankhan.petclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Shaizan.Khan
 * Created on 27-11-2019
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
