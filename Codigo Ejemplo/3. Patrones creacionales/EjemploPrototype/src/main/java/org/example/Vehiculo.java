package org.example;

import org.example.prototype.IPrototype;

public class Vehiculo implements IPrototype <Vehiculo> {

    private String placa;
    private String marca;
    private String linea;
    private int modelo;
    private Motor motor;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String marca, String linea, int modelo, Motor motor) {
        this.placa = placa;
        this.marca = marca;
        this.linea = linea;
        this.modelo = modelo;
        this.motor = motor;
    }

    public Vehiculo(Vehiculo v){
        this.motor = v.getMotor();
        this.marca = v.getMarca();
        this.modelo = v.getModelo();
        this.placa = v.getPlaca();
        this.linea = v.getLinea();
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getModelo() {
        return modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", motor='" + motor + '\'' +
                ", linea='" + linea + '\'' +
                ", modelo=" + modelo +
                '}';
    }

    @Override
    public IPrototype clone() {
        Vehiculo clon = new Vehiculo(this);
        return clon;
    }

    @Override
    public IPrototype deepClone() {
        Vehiculo clon = new Vehiculo(this);
        clon.motor = (Motor)this.motor.clone();
        return clon;
    }
}
