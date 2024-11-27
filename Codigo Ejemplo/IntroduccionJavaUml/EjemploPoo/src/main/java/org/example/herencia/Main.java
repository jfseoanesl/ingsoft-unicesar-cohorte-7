package org.example.herencia;

public class Main {

    public static void main(String[] args) {

        Empleado e = new Empleado(10, 40000);
        System.out.println(e.calcularSalario());

        EmpleadoComision ec = new EmpleadoComision(10, 40000, 0.1,1000000);
        System.out.println(ec.calcularSalario());
    }
}
