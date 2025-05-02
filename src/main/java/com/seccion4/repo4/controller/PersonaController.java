package com.seccion4.repo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.repo4.model.Persona;
import com.seccion4.repo4.service.PersonaService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;







@RequestMapping("/api/personas")
@RestController("")
public class PersonaController {
    @Autowired
    private PersonaService personaService;
    
    @PostMapping 
    public Persona postPersona(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }

    @GetMapping()
    public List<Persona> getPersonas() {
        return personaService.listarPersonas() ;
    }
    
    @GetMapping("/id={id}")
    public Persona getPersonaId(@PathVariable int id) {
        return personaService.buscarxId(id);
    }
    @GetMapping("/rut={rut}")
    public Persona getPersonaByRut(@PathVariable String rut) {
        return personaService.buscarxRut(rut);
    }

    @PutMapping("/{id}")
    public Persona putPersona(@PathVariable int id, @RequestBody Persona persona) {
        
        return personaService.modificar(id, persona);
    }

    @DeleteMapping("/{id}")
    public String deletePersona(@PathVariable int id){
        return personaService.borrar(id);
    }
}
