package org.example.herencia;

public class EmpleadoComision extends Empleado {
    private double pComision;
    private double ventasREalizadas;


    public EmpleadoComision(int nHorasLaboradas, double valorHora, double pComision, double ventasREalizadas) {
        super(nHorasLaboradas, valorHora);
        this.pComision = pComision;
        this.ventasREalizadas = ventasREalizadas;
    }

    public double getpComision() {
        return pComision;
    }

    public void setpComision(double pComision) {
        this.pComision = pComision;
    }

    public double getVentasREalizadas() {
        return ventasREalizadas;
    }

    public void setVentasREalizadas(double ventasREalizadas) {
        this.ventasREalizadas = ventasREalizadas;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" +
                super.toString()+
                "pComision=" + pComision +
                ", ventasREalizadas=" + ventasREalizadas +
                '}';
    }

    public double calcularComision(){
        return this.pComision * this.ventasREalizadas;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + this.calcularComision();
    }
}
