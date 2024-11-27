package org.example.polimorfismo;

public class EmpleadoSueldoBase extends Empleado {
    private double sueldo;

    public EmpleadoSueldoBase(String nombre, String apellido, double sueldo) {
        super(nombre, apellido);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "EmpleadoSueldoBase{" +
                super.toString()+
                ", sueldo=" + sueldo +
                '}';
    }

    @Override
    public double calcularSalario() {
        return this.sueldo;
    }
}
