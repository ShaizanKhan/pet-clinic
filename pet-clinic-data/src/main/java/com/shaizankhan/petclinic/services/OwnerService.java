package com.shaizankhan.petclinic.services;

import com.shaizankhan.petclinic.model.Owner;

/**
 * @author Shaizan.Khan
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}
