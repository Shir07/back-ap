/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Proyectos {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long idProyectos;
    private String tituloProyectos;
    private int fechaProyectos;
    private String descripcionProyectos;
    private String imagenProyectos;

    public Proyectos() {
    }

    public Proyectos(Long idProyectos, String tituloProyectos, int fechaProyectos, String descripcionProyectos, String imagenProyectos) {
        this.idProyectos = idProyectos;
        this.tituloProyectos = tituloProyectos;
        this.fechaProyectos = fechaProyectos;
        this.descripcionProyectos = descripcionProyectos;
        this.imagenProyectos = imagenProyectos;
    }

    public Long getIdProyectos() {
        return idProyectos;
    }

    public void setIdProyectos(Long idProyectos) {
        this.idProyectos = idProyectos;
    }

    public String getTituloProyectos() {
        return tituloProyectos;
    }

    public void setTituloProyectos(String tituloProyectos) {
        this.tituloProyectos = tituloProyectos;
    }

    public int getFechaProyectos() {
        return fechaProyectos;
    }

    public void setFechaProyectos(int fechaProyectos) {
        this.fechaProyectos = fechaProyectos;
    }

    public String getDescripcionProyectos() {
        return descripcionProyectos;
    }

    public void setDescripcionProyectos(String descripcionProyectos) {
        this.descripcionProyectos = descripcionProyectos;
    }

    public String getImagenProyectos() {
        return imagenProyectos;
    }

    public void setImagenProyectos(String imagenProyectos) {
        this.imagenProyectos = imagenProyectos;
    }
    
    
    
}
