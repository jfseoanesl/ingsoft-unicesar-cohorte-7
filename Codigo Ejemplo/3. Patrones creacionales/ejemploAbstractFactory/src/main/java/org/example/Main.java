package org.example;

import org.example.abstractfactory.AbstractFactory;
import org.example.dominio.IScooter;
import org.example.dominio.ScooterElectrica;
import org.example.factoryMethod.Factory;
import org.example.factoryMethod.FactoryElectrico;
import org.example.factoryMethod.FactoryGasolina;

public class Main {
    public static void main(String[] args) {
        Factory factory=configurationFactory("electrico");
        AbstractFactory abstractFactory = factory.getfabrica();
        IScooter scooter = abstractFactory.crearScooter();
        System.out.println(scooter.getDescripcionScooter());
    }

    public static Factory configurationFactory( String tecnologia){
          switch (tecnologia){
              case "electrico": return new FactoryElectrico();
              case "gasolina" : return new FactoryGasolina();
              default: return null;
          }
    }
}