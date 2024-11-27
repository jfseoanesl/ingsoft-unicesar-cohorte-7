package org.example.asociacion;

public class Persona {

    private String nDocumento;
    private String nombre;
    private String apellido;

    public Persona() {
    }

    public Persona(String nDocumento, String nombre, String apellido) {
        this.nDocumento = nDocumento;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public String getnDocumento() {
        return nDocumento;
    }

    public void setnDocumento(String nDocumento) {
        this.nDocumento = nDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nDocumento='" + nDocumento + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
