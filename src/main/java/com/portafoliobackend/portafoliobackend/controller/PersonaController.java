/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.controller;

import com.portafoliobackend.portafoliobackend.interfaces.IPersonaServices;
import com.portafoliobackend.portafoliobackend.model.Persona;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "hhttps://portafolioap-f5519.web.app")
public class PersonaController {
    @Autowired IPersonaServices ipersonaServices;
    
    
    @GetMapping("/personas/traer/{id}")
    public List<Persona> getPersona(){
        return ipersonaServices.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody @Valid Persona persona){
        ipersonaServices.savePersona(persona);
        return "La persona fue creada correctamente";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        ipersonaServices.deletePersona(id);
        return "La persona fue eliminada correctamente";
}
    
    
    @PutMapping("/personas/editar/{id}")
   // public Persona editPersona (@RequestBody @Valid Persona persona , @PathVariable Long id){
        //ipersonaServices.updatePersona(id, persona);
        //return persona;
    public Persona editPersona(@PathVariable Long id,
           @RequestParam("nombre")String nuevoNombre,
           @RequestParam("apellido")String nuevoApellido,
           @RequestParam("imagen")String nuevoImagen,
           @RequestParam("titulo") String nuevoTitulo,
           @RequestParam("descripcion")String nuevoDescripcion){
        Persona persona = ipersonaServices.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImagen);
        persona.setTitulo(nuevoTitulo);
        persona.setDescripcion(nuevoDescripcion);
        
        ipersonaServices.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
       public Persona findPersona (){
           return ipersonaServices.findPersona((long)1);
        
    }
        //esto es lo q iria en persona service de angular (traer/perfil)
    
}
