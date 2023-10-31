package org.mocha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Expense {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Report report;

    private LocalDate date;

    private double cost;

    private Unit unit;

    private String description;

    private boolean ausland;

    private String attachment;

    private String comment;

    @OneToMany(mappedBy = "expense")
    private List<Attachment> attachmentList;
}
