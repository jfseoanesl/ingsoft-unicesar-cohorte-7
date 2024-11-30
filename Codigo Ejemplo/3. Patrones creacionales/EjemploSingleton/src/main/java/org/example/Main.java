package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ConfiguracionSingleton instancia = ConfiguracionSingleton.getInstacia();
        System.out.println(instancia);
        instancia.setAppName("Nombre modificado");
        System.out.println(instancia);
        System.out.println(ConfiguracionSingleton.getInstacia());
    }
}