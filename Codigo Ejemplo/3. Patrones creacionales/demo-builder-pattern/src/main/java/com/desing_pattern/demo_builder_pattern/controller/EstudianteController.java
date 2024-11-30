package com.desing_pattern.demo_builder_pattern.controller;

import com.desing_pattern.demo_builder_pattern.domains.implementation.Asignatura;
import com.desing_pattern.demo_builder_pattern.domains.implementation.Estudiante;
import com.desing_pattern.demo_builder_pattern.domains.implementation.Programa;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
public class EstudianteController {

    @GetMapping
    public Estudiante getEstudiante(){

        Programa programa = new Programa("123", "Ing Sistemas",
                "Ingeneirias", "Unicesar - Valledupar");
        List<Asignatura> asignaturas = new ArrayList<>();
        Asignatura asignatura1 = new Asignatura("SS300", "PrgII",3,"Jairo Seoanes");
        asignaturas.add(asignatura1);
        Asignatura asignatura2 = new Asignatura("SS303", "Estructura Datos",3,"Braulio Barrios");
        asignaturas.add(asignatura2);

        //Estudiante estudiante = new Estudiante("ABC", "Luis", "Diaz",
                //28,7, programa, asignaturas);

        //Estudiante estudiante2 = new Estudiante("ABC", "Luis", "Diaz",
                //28,7);

        //return estudiante;
        return null;

    }
}
