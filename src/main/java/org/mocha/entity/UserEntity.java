package org.mocha.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class UserEntity {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;
}
