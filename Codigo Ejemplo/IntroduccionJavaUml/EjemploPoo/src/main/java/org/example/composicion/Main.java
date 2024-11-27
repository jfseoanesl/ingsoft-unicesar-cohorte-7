package org.example.composicion;

public class Main {
    public static void main(String[] args) {

        //Motor motor = new Motor();
        Vehiculo v = new Vehiculo("456", "Ford", "2020");
        System.out.println(v);
        v.setPlacaMotor("5677");

    }
}
