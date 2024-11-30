package org.example.dominio;

public class AutomovilGasolina implements IAutomovil{

    private int capacidadTanque;

    public AutomovilGasolina(int capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    @Override
    public String getDescripcionAutomovil() {
        return " automovil a gasolina con " +
                this.capacidadTanque +
                " galones de capacidad";
    }
}
