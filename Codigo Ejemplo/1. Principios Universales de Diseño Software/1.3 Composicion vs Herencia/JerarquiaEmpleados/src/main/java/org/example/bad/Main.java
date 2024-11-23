package org.example.bad;

public class Main {
    public static void main(String[] args) {

        Empleado provisional = new EmpleadoProvisional( );
        informacionEmpleado(provisional);

        Empleado planta = new EmpleadoPlanta( );
        informacionEmpleado(planta);


    }

    public static void informacionEmpleado(Empleado e){

        System.out.println("Cargo: " + e.getCargo());
        System.out.println("Horario: "+ e.getHorarioJornada());
        System.out.println("Ingresos: " + e.obtenerPago());

    }
}