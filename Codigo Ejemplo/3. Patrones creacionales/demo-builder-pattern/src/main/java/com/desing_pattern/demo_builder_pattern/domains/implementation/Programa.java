package com.desing_pattern.demo_builder_pattern.domains.implementation;

public class Programa {

    private String id;
    private String nombre;
    private String facultad;
    private String universidad;

    public Programa(String id, String nombre, String facultad, String universidad) {
        this.id = id;
        this.nombre = nombre;
        this.facultad = facultad;
        this.universidad = universidad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    @Override
    public String toString() {
        return "Programa{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", facultad='" + facultad + '\'' +
                ", universidad='" + universidad + '\'' +
                '}';
    }
}
