package org.example.agregacion;

public class Main {

    public static void main(String[] args) {

        Persona p = new Persona("234", "Gabriel", "Garcia");

        Libro libro = new Libro("ISBN123", "Cien años de soledad", p);
        System.out.println(libro);

        Libro libro2 = new Libro("ISBN234", "El coronel no tiene quien le escriba", p);
        System.out.println(libro2);


    }
}
