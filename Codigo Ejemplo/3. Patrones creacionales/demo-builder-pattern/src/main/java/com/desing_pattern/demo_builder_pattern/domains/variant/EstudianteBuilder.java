package com.desing_pattern.demo_builder_pattern.domains.variant;

import java.util.ArrayList;
import java.util.List;

public class EstudianteBuilder implements IEstudianteBuilder{

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private int semestre;
    private Programa programa;
    private List<Asignatura> asignaturas;

    public EstudianteBuilder() {
        this.asignaturas = new ArrayList<>();
    }

    @Override
    public IEstudianteBuilder id(String id) {
       this.id=id;
        return this;
    }

    @Override
    public IEstudianteBuilder nombre(String nombre) {
        this.nombre=nombre;
        return this;
    }

    @Override
    public IEstudianteBuilder apellido(String apellido) {
        this.apellido=apellido;
        return this;
    }

    @Override
    public IEstudianteBuilder edad(int edad) {
        this.edad = edad;
        return this;
    }

    @Override
    public IEstudianteBuilder semestre(int semestre) {
        this.semestre=semestre;
        return this;
    }

    @Override
    public IEstudianteBuilder programa(String id, String nombre, String facultad, String universidad) {
        this.programa = new Programa(id, nombre,facultad,universidad);
        return this;
    }

    @Override
    public IEstudianteBuilder asignatura(String codigo, String nombre, int creditos, String docente) {
        this.asignaturas.add(new Asignatura(codigo,nombre,creditos, docente));
        return this;
    }

    @Override
    public Estudiante build() {
        return new Estudiante(id,nombre,apellido, edad,
                semestre, programa, asignaturas);
    }
}
