package org.mocha.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Report {
    @Id
    @GeneratedValue
    private int id;

    @ManyToOne
    private User user;

    private String userName;

    private LocalDateTime startPeriod;

    private LocalDateTime endPeriod;

    private Status status;

    private String summary;

    private double subTotal;

}

