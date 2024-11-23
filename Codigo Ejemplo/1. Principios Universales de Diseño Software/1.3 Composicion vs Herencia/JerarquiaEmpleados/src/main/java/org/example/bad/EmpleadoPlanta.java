package org.example.bad;

public class EmpleadoPlanta extends Empleado{

    private double bonificacion;
    public  EmpleadoPlanta(){
        this("Abogado", 3000, 9, 16, 1000);

    }
    public EmpleadoPlanta(String cargo, double salario, int horaIngreso, int horaSalida, double bonificacion) {
        super(cargo, salario, horaIngreso, horaSalida);
        this.bonificacion = bonificacion;
    }


    public double getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(double bonificacion) {
        this.bonificacion = bonificacion;
    }

    @Override
    public double obtenerPago() {
        return this.getSalario() + this.bonificacion;
    }
}
