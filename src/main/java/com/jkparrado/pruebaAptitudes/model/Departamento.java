package com.jkparrado.pruebaAptitudes.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "departamento")
public class Departamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iddepartamento")
    private Long iddepartamento;

    @Column(name = "nombre_departamento")
    private String nombreDepartamento;

    public Departamento() {
    }

    public Departamento(String nombreDepartamento, Long iddepartamento) {
        this.nombreDepartamento = nombreDepartamento;
        this.iddepartamento = iddepartamento;
    }

    public Long getIddepartamento() {
        return iddepartamento;
    }

    public void setIddepartamento(Long iddepartamento) {
        this.iddepartamento = iddepartamento;
    }

    public String getNombreDepartamento() {
        return nombreDepartamento;
    }

    public void setNombreDepartamento(String nombreDepartamento) {
        this.nombreDepartamento = nombreDepartamento;
    }
}
