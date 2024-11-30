package org.example;

import org.example.prototype.RegistryPrototype;

public class Main {
    public static void main(String[] args) {

        Motor motor = new Motor("123",500, "power");
        Vehiculo v = new Vehiculo("123", "Toyota", "Corola", 2013, motor);
        System.out.println(v);
        RegistryPrototype.addPrototype("original", v);
        v = (Vehiculo) RegistryPrototype.getPrototype("original");
        v.setPlaca("4567");
        System.out.println(v);
        RegistryPrototype.addPrototype("copia", v);

    }
}