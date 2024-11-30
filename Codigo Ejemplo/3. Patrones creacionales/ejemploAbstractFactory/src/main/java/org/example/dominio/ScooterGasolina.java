package org.example.dominio;

public class ScooterGasolina implements IScooter{

    private int capacidadTanque;

    public ScooterGasolina(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getDescripcionScooter() {
        return " Scooter a gosolina con " +
                this.capacidadTanque +
                " galones de capacidad";
    }
}
