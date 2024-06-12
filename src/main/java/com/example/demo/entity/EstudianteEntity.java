package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "ESTUDIANTE")
public class EstudianteEntity {

    @Id
    private int id;

    @Column(name = "NOMBRE")
    private String nombre;


}
