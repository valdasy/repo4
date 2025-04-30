package com.seccion4.repo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.repo4.model.Persona;
@Repository
public class PersonaRepository {
    private List<Persona> personas=new ArrayList<>();
    PersonaRepository(){
        personas.add(new Persona(1,  "12345678-9",  "wacoldo", "Soto", 45));
        personas.add(new Persona(2, "98765432-1", "María", "Pérez", 32));
        personas.add(new Persona(3, "11222333-4", "Juan", "González", 28));
        personas.add(new Persona(4, "55667788-5", "Lucía", "Ramírez", 37));
        personas.add(new Persona(5, "99887766-2", "Carlos", "Muñoz", 50));
        personas.add(new Persona(6, "33445566-7", "Ana", "Fernández", 41));

    }
    public Persona create(Persona persona){
        personas.add(persona);
        System.out.println(persona.toString());
        return persona;
    }
    
    public List<Persona> readAll(){
        return personas;
    }
    
}
