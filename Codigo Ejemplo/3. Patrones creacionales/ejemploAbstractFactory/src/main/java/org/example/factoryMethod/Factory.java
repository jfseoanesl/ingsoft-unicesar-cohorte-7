package org.example.factoryMethod;

import org.example.abstractfactory.AbstractFactory;

public abstract class Factory {


    public AbstractFactory getfabrica(){
        return this.crearFabrica();
    }

     public abstract AbstractFactory crearFabrica();

}
