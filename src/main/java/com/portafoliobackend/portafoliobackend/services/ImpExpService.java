/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portafoliobackend.portafoliobackend.services;

import com.portafoliobackend.portafoliobackend.interfaces.IExpServices;
import com.portafoliobackend.portafoliobackend.model.Experiencia;
import com.portafoliobackend.portafoliobackend.repository.IExpRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpExpService implements IExpServices {
    @Autowired IExpRepository iexpRepository; 
    
  

    @Override
    public List<Experiencia> getExperiencia() {
         List<Experiencia> experiencia = iexpRepository.findAll();
        return experiencia;
    }

    @Override
    public void saveExperiencia(Experiencia experiencia) {
        iexpRepository.save(experiencia);
         }

    @Override
    public void deleteExperiencia(Long id) {
        iexpRepository.deleteById(id);
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia experiencia = iexpRepository.findById(id).orElse(null);
        return experiencia;
    }
    
}
