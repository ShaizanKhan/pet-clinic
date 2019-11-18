package com.shaizankhan.petclinic.services;

import java.util.Set;

/**
 * @author Shaizan.Khan
 * @param <T>
 * @param <ID>
 */
public interface CrudService<T, ID> {
    Set<T> findAll();
    T findById(ID id);
    T save(T object);
    void delete(T object);
    void deleteById(ID id);
}
