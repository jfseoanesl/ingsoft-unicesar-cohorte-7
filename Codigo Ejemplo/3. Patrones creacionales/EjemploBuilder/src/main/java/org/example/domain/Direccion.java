package org.example.domain;

public class Direccion {

    private String ciudad;
    private String barrio;

    public Direccion(String ciudad, String barrio) {
        this.ciudad = ciudad;
        this.barrio = barrio;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "ciudad='" + ciudad + '\'' +
                ", barrio='" + barrio + '\'' +
                '}';
    }
}
