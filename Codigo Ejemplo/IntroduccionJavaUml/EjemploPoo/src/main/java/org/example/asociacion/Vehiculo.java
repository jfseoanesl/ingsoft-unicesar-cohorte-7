package org.example.asociacion;

public class Vehiculo {

    private String matricula;
    private String marca;
    private int modelo;
    private Persona chofer;

    public Vehiculo() {
    }

    public Vehiculo(String matricula, Persona chofer, int modelo, String marca) {
        this.matricula = matricula;
        this.chofer = chofer;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Persona getChofer() {
        return chofer;
    }

    public void setChofer(Persona chofer) {
        this.chofer = chofer;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo=" + modelo +
                ", chofer=" + chofer +
                '}';
    }
}
