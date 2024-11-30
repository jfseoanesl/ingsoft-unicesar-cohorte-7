package org.example.factoryMethod;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.ConcreteFactoryGasolina;

public class FactoryGasolina extends Factory{
    @Override
    public AbstractFactory crearFabrica() {
        return new ConcreteFactoryGasolina();
    }
}
