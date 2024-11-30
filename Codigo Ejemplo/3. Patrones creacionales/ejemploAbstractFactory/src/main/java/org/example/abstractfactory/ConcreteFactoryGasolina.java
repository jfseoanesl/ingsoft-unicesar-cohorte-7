package org.example.abstractfactory;

import org.example.dominio.AutomovilGasolina;
import org.example.dominio.IAutomovil;
import org.example.dominio.IScooter;
import org.example.dominio.ScooterGasolina;

public class ConcreteFactoryGasolina implements AbstractFactory{
    @Override
    public IScooter crearScooter() {
        return new ScooterGasolina(300);
    }

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilGasolina(500);
    }
}
