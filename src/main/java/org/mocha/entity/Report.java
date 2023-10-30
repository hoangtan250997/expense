package org.mocha.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Report {
    @Id
    @GeneratedValue
    private int id;

    @Column
    private String name;

    @OneToMany
    @JoinColumn(name = "expense_id")
    private List<Expense> expenseList;
}

