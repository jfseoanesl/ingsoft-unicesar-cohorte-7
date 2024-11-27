package org.example.asociacion;

public class Main {
    public static void main(String[] args) {

        Persona p = new Persona("123","Jairo", "seoanes");
        System.out.println(p);

        Vehiculo v = new Vehiculo("123", p, 2023,"TYoyota");
        System.out.println(v);

    }
}
