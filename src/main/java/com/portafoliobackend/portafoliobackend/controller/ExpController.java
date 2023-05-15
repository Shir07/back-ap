/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.controller;

import com.portafoliobackend.portafoliobackend.interfaces.IExpServices;
import com.portafoliobackend.portafoliobackend.model.Experiencia;
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
@CrossOrigin(origins = "https://portafolioap-f5519.web.app")
public class ExpController {
    @Autowired IExpServices iexpServices; 
    
    
    
    @GetMapping("/experiencia/traer/")
    public List<Experiencia> getExperiencia(){
        return iexpServices.getExperiencia();
    }
    
    @PostMapping("/experiencia/crear")
    public String createExperiencia(@RequestBody @Valid Experiencia experiencia){
        iexpServices.saveExperiencia(experiencia);
        return "La experiencia fue creada correctamente";
    }
    
    @DeleteMapping("/experiencia/borrar/{id}")
    public String deleteExperiencia(@PathVariable Long id){
        iexpServices.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
}
    
    
  @PutMapping("/experiencia/editar/{id}")
  public Experiencia editExperiencia (@PathVariable Long id,
          @RequestParam("titulo") String NuevoTitulo,
          @RequestParam("lugar")String nuevoLugar,
          @RequestParam("imagen")String nuevoImagen,
          @RequestParam("fecha") String nuevoFecha,
          @RequestParam("fecha2") String nuevoFecha2,
          @RequestParam("descripcion")String nuevoDescripcion){
      
      Experiencia experiencia = iexpServices.findExperiencia(id);
      experiencia.setTitulo(NuevoTitulo);
      experiencia.setLugar(nuevoLugar);
      experiencia.setImagen(nuevoImagen);
      experiencia.setDescripcion(nuevoDescripcion);
      experiencia.setFecha(nuevoFecha);
      experiencia.setFecha2(nuevoFecha2);
      
      
       iexpServices.saveExperiencia(experiencia);
        return experiencia;
      
  }
  
  @GetMapping("/experiencia/traer/experiencia")
       public Experiencia findExperiencia (){
           return iexpServices.findExperiencia((long)1);
        
    }
   
}