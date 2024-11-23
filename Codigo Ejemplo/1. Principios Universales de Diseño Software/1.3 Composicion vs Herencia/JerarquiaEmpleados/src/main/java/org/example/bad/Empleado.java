package org.example.bad;

public abstract class Empleado {
    private String cargo;
    protected double salario;
    private int horaIngreso;
    private int horaSalida;


    public Empleado(String cargo, double salario, int horaIngreso, int horaSalida) {
        this.cargo = cargo;
        this.salario = salario;
        this.horaIngreso = horaIngreso;
        this.horaSalida = horaSalida;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(int horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHorarioJornada(){
        return "Horario [" + this.horaIngreso + "-" + this.horaSalida + "]";
    }
    public abstract double obtenerPago();


}
