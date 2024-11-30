package desing_patterns.demo_prototype_pattern.dominio;

import desing_patterns.demo_prototype_pattern.prorotype.IPrototype;

public class Vehiculo implements IPrototype {

    private String noMatricula;
    private String marca;
    private String color;
    private int modelo;
    private Motor motor;

    public Vehiculo() {
    }

    public Vehiculo(String noMatricula, String marca, String color, int modelo, Motor motor) {
        this.noMatricula = noMatricula;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
        this.motor = motor;
    }

    private Vehiculo(Vehiculo v){
        this.noMatricula = v.noMatricula;
        this.color = v.color;
        this.marca = v.marca;
        this.modelo = v.modelo;
    }

    public String getNoMatricula() {
        return noMatricula;
    }

    public void setNoMatricula(String noMatricula) {
        this.noMatricula = noMatricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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
                "noMatricula='" + noMatricula + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                ", modelo=" + modelo +
                ", motor=" + motor +
                '}';
    }

    @Override
    public IPrototype clone() {

        Vehiculo clon = new Vehiculo(this);
        clon.setMotor(this.motor);
        return clon;
    }

    @Override
    public IPrototype deepClone() {
        Vehiculo clon = new Vehiculo(this);
        clon.setMotor((Motor)this.motor.clone());
        return clon;
    }
}
