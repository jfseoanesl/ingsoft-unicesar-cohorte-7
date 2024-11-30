package org.example.domain;

public class Cargo {
    private  String descripcion;
    private double ssalario;

    public Cargo(String descripcion, double ssalario) {
        this.descripcion = descripcion;
        this.ssalario = ssalario;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getSsalario() {
        return ssalario;
    }

    public void setSsalario(double ssalario) {
        this.ssalario = ssalario;
    }

    @Override
    public String toString() {
        return "Cargo{" +
                "descripcion='" + descripcion + '\'' +
                ", ssalario=" + ssalario +
                '}';
    }
}
