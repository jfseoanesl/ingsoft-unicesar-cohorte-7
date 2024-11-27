package org.example.herencia;

public class Empleado {

    private int nHorasLaboradas;
    private double valorHora;

    public Empleado() {
    }

    public Empleado(int nHorasLaboradas, double valorHora) {
        this.nHorasLaboradas = nHorasLaboradas;
        this.valorHora = valorHora;
    }

    public int getnHorasLaboradas() {
        return nHorasLaboradas;
    }

    public void setnHorasLaboradas(int nHorasLaboradas) {
        this.nHorasLaboradas = nHorasLaboradas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double calcularSalario(){
            return this.valorHora * this.nHorasLaboradas;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nHorasLaboradas=" + nHorasLaboradas +
                ", valorHora=" + valorHora +
                '}';
    }
}
