package com.desing_pattern.demo_builder_pattern.controller;

import com.desing_pattern.demo_builder_pattern.domains.implementation.Director;
import com.desing_pattern.demo_builder_pattern.domains.implementation.Estudiante;
import com.desing_pattern.demo_builder_pattern.domains.implementation.IEstudianteBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/")
public class EstudianteBuilderController {

    @GetMapping("builder/")
    public List<Estudiante> getEstudiantes(){

        Director director = new Director();
        IEstudianteBuilder builder = new Estudiante.EstudianteBuilder();
        director.builderEstudiantesSistemasUnicesar(builder);

        Estudiante a = builder.id("123").apellido("Seoanes").build();

        Estudiante b = builder.id("678").apellido("Rodriguez").build();

        Estudiante c = builder.id("987").apellido("Perez").build();

        List<Estudiante> estudiantes = Arrays.asList(a,b,c);
        
        return estudiantes;

    }

}
