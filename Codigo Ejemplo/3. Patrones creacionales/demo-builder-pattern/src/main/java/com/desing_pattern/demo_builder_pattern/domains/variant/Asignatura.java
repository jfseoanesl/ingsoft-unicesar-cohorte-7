package com.desing_pattern.demo_builder_pattern.domains.variant;

public class Asignatura {
    private String codigo;
    private String nombre;
    private int noCreditos;
    private String docente;

    public Asignatura(String codigo, String nombre, int noCreditos, String docente) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.noCreditos = noCreditos;
        this.docente = docente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNoCreditos() {
        return noCreditos;
    }

    public void setNoCreditos(int noCreditos) {
        this.noCreditos = noCreditos;
    }

    public String getDocente() {
        return docente;
    }

    public void setDocente(String docente) {
        this.docente = docente;
    }

    @Override
    public String toString() {
        return "Asignatura{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", noCreditos=" + noCreditos +
                ", docente='" + docente + '\'' +
                '}';
    }
}
