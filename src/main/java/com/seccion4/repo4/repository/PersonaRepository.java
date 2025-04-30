package com.seccion4.repo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.repo4.model.Persona;
@Repository
public class PersonaRepository {
    private List<Persona> personas=new ArrayList<>();

    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(persona.toString());
        return persona;
    }
    
    public List<Persona> readAll(){
        return personas;
    }
    
}
