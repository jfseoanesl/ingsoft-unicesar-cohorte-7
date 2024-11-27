package org.example.composicion;

public class Motor {

    private String noPlaca;
    private int noCilindros;
    private double potenciaMax;

    public Motor() {
    }

    public Motor(String noPlaca, int noCilindros, double potenciaMax) {
        this.noPlaca = noPlaca;
        this.noCilindros = noCilindros;
        this.potenciaMax = potenciaMax;
    }

    public String getNoPlaca() {
        return noPlaca;
    }

    public void setNoPlaca(String noPlaca) {
        this.noPlaca = noPlaca;
    }

    public int getNoCilindros() {
        return noCilindros;
    }

    public void setNoCilindros(int noCilindros) {
        this.noCilindros = noCilindros;
    }

    public double getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(double potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "noPlaca='" + noPlaca + '\'' +
                ", noCilindros=" + noCilindros +
                ", potenciaMax=" + potenciaMax +
                '}';
    }
}
