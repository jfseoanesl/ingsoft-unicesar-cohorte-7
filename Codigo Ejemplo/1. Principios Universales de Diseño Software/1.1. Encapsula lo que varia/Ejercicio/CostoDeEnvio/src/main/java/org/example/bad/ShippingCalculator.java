package org.example.bad;

/*
    Una empresa de transporte necesita calcular las tarifas de envío para distintos tipos
     de paquetes y destinos. Actualmente, el sistema tiene lógica dispersa para calcular
     los costos, lo que dificulta agregar nuevos tipos de paquetes o destinos sin modificar
     múltiples partes del código.

     Problemas:
        * Falta de extensibilidad
        * Baja cohesion
        * Baja reutilización
 */

public class ShippingCalculator {


        public double calculateShippingCost(String packageType, String destination, double weight) {
            double baseCost;

            // Lógica para calcular el costo base según el tipo de paquete
            if (packageType.equalsIgnoreCase("standard")) {
                baseCost = weight * 5;
            } else if (packageType.equalsIgnoreCase("express")) {
                baseCost = weight * 10;
            } else if (packageType.equalsIgnoreCase("overnight")) {
                baseCost = weight * 20;
            } else {
                throw new IllegalArgumentException("Tipo de paquete desconocido: " + packageType);
            }

            // Lógica para calcular el costo adicional según el destino
            double destinationCost;
            if (destination.equalsIgnoreCase("local")) {
                destinationCost = 10;
            } else if (destination.equalsIgnoreCase("national")) {
                destinationCost = 20;
            } else if (destination.equalsIgnoreCase("international")) {
                destinationCost = 50;
            } else {
                throw new IllegalArgumentException("Destino desconocido: " + destination);
            }

            return baseCost + destinationCost;
        }

}
