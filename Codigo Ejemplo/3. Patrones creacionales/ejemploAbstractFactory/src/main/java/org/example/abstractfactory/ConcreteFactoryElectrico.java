package org.example.abstractfactory;

import org.example.dominio.AutomovilElectrico;
import org.example.dominio.IAutomovil;
import org.example.dominio.IScooter;
import org.example.dominio.ScooterElectrica;

public class ConcreteFactoryElectrico implements AbstractFactory {

    @Override
    public IScooter crearScooter() {
        return new ScooterElectrica(500);
    }

    @Override
    public IAutomovil crearAutomovil() {
        return new AutomovilElectrico(1000);
    }
}
