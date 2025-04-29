package com.seccion4.repo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;



@RequestMapping("/api/personas")
@RestController
public class PersonaController {
    
    @GetMapping
    public String Saludar()
    {
        return "Hola esto esta funcionando !!";
    }
    
}
