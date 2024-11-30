package org.example;

public class Camioneta extends Vehiculo{
    private double capacidadCarga;

    public Camioneta() {

    }

    public Camioneta(String placa, String marca, String linea, int modelo, double capacidadCarga, Motor motor) {
        super(placa, marca, linea, modelo, motor);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public String toString() {
        return "Camioneta{" +
                super.toString()+
                ", capacidadCarga=" + capacidadCarga +
                '}';
    }
}
