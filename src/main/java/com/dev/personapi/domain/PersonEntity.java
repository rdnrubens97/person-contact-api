package com.dev.personapi.domain;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "person")
public class PersonEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String cpf;
    @Column
    private String birthDate;
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ContactEntity> contactEntityList;

}
