package org.example.polimorfismo;

public class EmpleadoHora extends Empleado{

    private int nHoraLaboradas;
    private double valorHora;

    public EmpleadoHora(String nombre, String apellido, int nHoraLaboradas, double valorHora) {
        super(nombre, apellido);
        this.nHoraLaboradas = nHoraLaboradas;
        this.valorHora = valorHora;
    }

    public int getnHoraLaboradas() {
        return nHoraLaboradas;
    }

    public void setnHoraLaboradas(int nHoraLaboradas) {
        this.nHoraLaboradas = nHoraLaboradas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        return "EmpleadoHora{" +
                super.toString()+
                ", nHoraLaboradas=" + nHoraLaboradas +
                ", valorHora=" + valorHora +
                '}';
    }

    @Override
    public double calcularSalario() {
        return this.nHoraLaboradas *  this.valorHora;
    }
}
