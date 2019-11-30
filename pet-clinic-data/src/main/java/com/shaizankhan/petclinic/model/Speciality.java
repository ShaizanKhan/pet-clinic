package com.shaizankhan.petclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author Shaizan.Khan
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class Speciality extends BaseEntity {

    @Column(name = "description")
    private String description;

}
