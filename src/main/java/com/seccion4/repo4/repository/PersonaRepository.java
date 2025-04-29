package com.seccion4.repo4.repository;

import java.util.ArrayList;
import java.util.List;

import com.seccion4.repo4.model.Persona;

public class PersonaRepository {
    private List<Persona> personas=new ArrayList<>();

    public Persona create(Persona persona){
        personas.add(persona);
        return persona;
    }
}
