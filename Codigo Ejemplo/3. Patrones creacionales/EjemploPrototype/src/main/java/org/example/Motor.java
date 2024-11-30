package org.example;

import org.example.prototype.IPrototype;

public class Motor implements IPrototype <Motor> {

    private String noSerie;
    private double potencia;
    private String marca;

    public Motor(String noSerie, double potencia, String marca) {
        this.noSerie = noSerie;
        this.potencia = potencia;
        this.marca = marca;
    }

    public Motor(Motor m){
        this.marca = m.marca;
        this.potencia = m.potencia;
        this.noSerie = m.noSerie;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "noSerie='" + noSerie + '\'' +
                ", potencia=" + potencia +
                ", marca='" + marca + '\'' +
                '}';
    }

    @Override
    public IPrototype clone() {
        return new Motor(this);
    }

    @Override
    public IPrototype deepClone() {
        return this.clone();
    }
}
