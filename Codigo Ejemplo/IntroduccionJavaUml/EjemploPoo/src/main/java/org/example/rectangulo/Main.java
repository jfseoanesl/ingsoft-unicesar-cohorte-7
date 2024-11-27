package org.example.rectangulo;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Rectangulo.BORDER = 10;
        Rectangulo r = new Rectangulo();
        r.setBase(50);
        r.setAltura(80);
        imprimirRectangulo(r);

        Rectangulo r2 = new Rectangulo(5,9);
        imprimirRectangulo(r2);

        System.out.println(r==r2);
        System.out.println(r.equals(r2));

        System.out.println("Suma de areas r y r2: " + r.sumarArea(r2));
    }

    public static void imprimirRectangulo(Rectangulo r){
        System.out.println(r.getAltura()+","+r.getBase());
        System.out.println("Border: " + Rectangulo.BORDER);
        System.out.println("Area: " + r.calcularArea());
        System.out.println("Perimetro: " + r.calcularPerimetro());
        System.out.println("Total objetos: " + Rectangulo.contadodor);
    }
}