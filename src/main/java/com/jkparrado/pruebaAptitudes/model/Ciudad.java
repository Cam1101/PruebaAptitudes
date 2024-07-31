package com.jkparrado.pruebaAptitudes.model;

import jakarta.persistence.*;


@Entity
@Table(name = "ciudad")
public class Ciudad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idciudad")
    private Long idCiudades;

    @Column(name = "nombre_ciudad")
    private String nombreCiudad;

    @Column(name = "num_habitantes")
    private Integer numHabitantes;

    @ManyToOne
    @JoinColumn(name = "iddepartamento")
    private Departamento departamento;

    public Long getIdCiudad() {
        return idCiudades;
    }

    public void setIdCiudad(Long idCiudades) {
        this.idCiudades = idCiudades;
    }

    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public Integer getNumHabitantes() {
        return numHabitantes;
    }

    public void setNumHabitantes(Integer numHabitantes) {
        this.numHabitantes = numHabitantes;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}