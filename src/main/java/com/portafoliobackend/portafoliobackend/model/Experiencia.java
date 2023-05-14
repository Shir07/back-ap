/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter 
@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO )
    private Long id;
    private String titulo;
    private String lugar;
    private String fecha;
    private String fecha2;
    private String descripcion;
    private String imagen;

    public Experiencia() {
    }

    public Experiencia(Long id, String titulo, String lugar, String fecha, String fecha2, String descripcion, String imagen) {
        this.id = id;
        this.titulo = titulo;
        this.lugar = lugar;
        this.fecha = fecha;
        this.fecha2 = fecha2;
        this.descripcion = descripcion;
        this.imagen = imagen;
    }

    
    
    
    
}
 
