package org.example.bad;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

            ShippingCalculator calculator = new ShippingCalculator();
            double cost = calculator.calculateShippingCost("express", "national", 2.0);
            System.out.println("Costo de envío: $" + cost);

    }
}