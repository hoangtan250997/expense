package org.mocha.entity;

import jakarta.persistence.*;

@Entity
public class HoangUser {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

}

