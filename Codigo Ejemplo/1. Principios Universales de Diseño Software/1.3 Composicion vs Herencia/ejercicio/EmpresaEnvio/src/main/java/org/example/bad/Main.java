package org.example.bad;

/*
Una empresa de envíos ofrece servicios de transporte para paquetes nacionales e internacionales,
con opciones premium y estándar. Además, los envíos pueden estar sujetos a impuestos o
estar exentos. Inicialmente, el sistema fue diseñado utilizando herencia, pero el modelo
presenta problemas de extensibilidad y mantenimiento.

Problemas:
* Explosión de Clases
* Falta de Flexibilidad

 */

public class Main {
    public static void main(String[] args) {
        EnvioNacionalPremiumConImpuesto enpci = new EnvioNacionalPremiumConImpuesto();
        System.out.println("costo: " + enpci.calcularCostoEnvio());

        EnvioNacionalPremiunSinImpuesto enpsi= new EnvioNacionalPremiunSinImpuesto();
        System.out.println("costo: " + enpsi.calcularCostoEnvio());
    }
}