package org.example.bad;

public class EmpleadoProvisional extends Empleado  {
    public EmpleadoProvisional(String cargo, double salario, int horaIngreso, int horaSalida) {
        super(cargo, salario, horaIngreso, horaSalida);
    }

    public EmpleadoProvisional() {
        this("Ingeniero", 1000, 8,18);
    }

    @Override
    public double obtenerPago() {
        return this.salario;
    }
}
