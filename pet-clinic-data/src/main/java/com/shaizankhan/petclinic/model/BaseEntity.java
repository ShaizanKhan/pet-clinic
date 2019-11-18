package com.shaizankhan.petclinic.model;

import java.io.Serializable;

/**
 * @author Shaizan.Khan
 */
public class BaseEntity implements Serializable {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
