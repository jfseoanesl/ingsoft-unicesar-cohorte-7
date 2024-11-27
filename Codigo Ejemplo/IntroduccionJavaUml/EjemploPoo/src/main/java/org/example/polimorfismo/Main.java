package org.example.polimorfismo;

public class Main {
    public static void main(String[] args) {

        Empleado eh = new EmpleadoHora("jairo",
                "seoanes", 18, 30000);
        imprimirEmpleado(eh);

        Empleado ec = new EmpleadoComision("luis",
                "diaz", 1000000, 0.1);
        imprimirEmpleado(ec);

        EmpleadoSueldoBase eb = new EmpleadoSueldoBase("jame",
                "rodriguez", 50000);
        imprimirEmpleado(eb);

    }

    public static void imprimirEmpleado(Empleado e){
        System.out.println(e);
        System.out.println("Salario: " + e.getSalario());
    }




}
