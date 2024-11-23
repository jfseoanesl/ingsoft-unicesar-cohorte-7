package org.example.bad;

public class EmpleadoOPS extends Empleado{
    public EmpleadoOPS(String cargo, double salario, int horaIngreso, int horaSalida) {
        super(cargo, salario, horaIngreso, horaSalida);
    }

    @Override
    public double obtenerPago() {
        return 50000;
    }

    @Override
    public String getHorarioJornada() {
        throw new IllegalStateException("Este usuario no cumple horario");
    }
}
