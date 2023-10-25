package org.mocha.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Events")
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
