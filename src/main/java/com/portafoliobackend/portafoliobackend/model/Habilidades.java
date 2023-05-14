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
public class Habilidades {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long idHabilidades;
    private String tituloHabilidades;
    private int fechaHabilidades;
    private String descripcionHabilidades;
    private String imagenHabilidades;

    public Habilidades() {
    }

    public Habilidades(Long idHabilidades, String tituloHabilidades, int fechaHabilidades, String descripcionHabilidades, String imagenHabilidades) {
        this.idHabilidades = idHabilidades;
        this.tituloHabilidades = tituloHabilidades;
        this.fechaHabilidades = fechaHabilidades;
        this.descripcionHabilidades = descripcionHabilidades;
        this.imagenHabilidades = imagenHabilidades;
    }

    public Long getIdHabilidades() {
        return idHabilidades;
    }

    public void setIdHabilidades(Long idHabilidades) {
        this.idHabilidades = idHabilidades;
    }

    public String getTituloHabilidades() {
        return tituloHabilidades;
    }

    public void setTituloHabilidades(String tituloHabilidades) {
        this.tituloHabilidades = tituloHabilidades;
    }

    public int getFechaHabilidades() {
        return fechaHabilidades;
    }

    public void setFechaHabilidades(int fechaHabilidades) {
        this.fechaHabilidades = fechaHabilidades;
    }

    public String getDescripcionHabilidades() {
        return descripcionHabilidades;
    }

    public void setDescripcionHabilidades(String descripcionHabilidades) {
        this.descripcionHabilidades = descripcionHabilidades;
    }

    public String getImagenHabilidades() {
        return imagenHabilidades;
    }

    public void setImagenHabilidades(String imagenHabilidades) {
        this.imagenHabilidades = imagenHabilidades;
    }
    
    
    
}
