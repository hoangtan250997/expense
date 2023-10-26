package org.mocha.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
public class Report {
    @Id
    @GeneratedValue
    private int id;

    private String name;
}
