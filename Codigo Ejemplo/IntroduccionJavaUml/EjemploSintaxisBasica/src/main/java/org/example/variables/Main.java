package org.example.variables;


public class Main {

    public static void main(String[] args) {

        int variableInt=1_000_000;
        double variableDecimal = 30.5;
        boolean variableBool = true;
        String variableString = "valor string"; // inferencia de tipos
        System.out.println(variableInt);

        // conversiones de tipo
        long valor = 5; // ampliacion
        int valorInt = (int)valor; // conversion

        // clases envoltorio
        Integer valorInteger = 50;
        System.out.println(valorInt==5);
        System.out.println(valorInteger==50);
        System.out.println(valorInteger.equals(50));

        // autoboxing
        Integer autBoxing = 6;

        // unboxing
        int unboxing = autBoxing.intValue();



    }

}