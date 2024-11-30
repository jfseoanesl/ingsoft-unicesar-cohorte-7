package org.example.factoryMethod;

import org.example.abstractfactory.AbstractFactory;
import org.example.abstractfactory.ConcreteFactoryElectrico;

public class FactoryElectrico extends Factory {


    @Override
    public AbstractFactory crearFabrica() {
        return new ConcreteFactoryElectrico();
    }
}
