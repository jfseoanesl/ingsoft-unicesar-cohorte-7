package com.desing_pattern.demo_builder_pattern.domains.implementation;

public interface IEstudianteBuilder {

    IEstudianteBuilder id(String id);
    IEstudianteBuilder nombre(String nombre);
    IEstudianteBuilder apellido(String apellido);
    IEstudianteBuilder edad(int edad);
    IEstudianteBuilder semestre(int semestre);
    IEstudianteBuilder programa(String id, String nombre, String facultad, String universidad);
    IEstudianteBuilder asignatura(String codigo, String nombre, int creditos, String docente);
    Estudiante build();
}
