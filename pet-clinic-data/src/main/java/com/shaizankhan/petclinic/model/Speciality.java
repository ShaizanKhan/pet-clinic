package com.shaizankhan.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Shaizan.Khan
 */
@Entity
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
