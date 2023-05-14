/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.interfaces;

import com.portafoliobackend.portafoliobackend.model.Persona;
import java.util.List;


public interface IPersonaServices {
    
    //traer
    public List<Persona>getPersona();
    
    
    //guardar
    public void savePersona(Persona persona);
    
    
    //eliminar
    public void deletePersona(Long id);
    
    
    // buscar
    public Persona findPersona(Long id);
    
    //public Persona Persona (Long id, Persona updatePersona);   
}
