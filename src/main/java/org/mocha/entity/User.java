package org.mocha.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "uzer")
public class User {
    @Id
    @GeneratedValue
    private int id;

    private String name;

    private String userName;

    private String password;

    @Enumerated(EnumType.STRING)
    private Role roles;

}
