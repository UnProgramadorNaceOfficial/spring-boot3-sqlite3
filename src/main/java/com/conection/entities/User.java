package com.conection.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "usuarios")
public class User {

    @Id
    private Long id;
    private String name;

    @Column(name = "last_name")
    private String lastName;
    private Integer age;
    private String email;
}
