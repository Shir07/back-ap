/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.interfaces;


import com.portafoliobackend.portafoliobackend.model.Experiencia;
import java.util.List;


public interface IExpServices {
    
    //traer
    public List<Experiencia>getExperiencia();
    
    
    //guardar
    public void saveExperiencia(Experiencia experiencia);
    
    
    //eliminar
    public void deleteExperiencia(Long id);
    
    
    // buscar
    public Experiencia findExperiencia(Long id);
}
