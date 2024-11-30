package org.example.dominio;

public class Pedido {

    private String descripcion;
    private double valor;

    public Pedido() {
    }

    public Pedido(String descripcion, double valor) {
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "descripcion='" + descripcion + '\'' +
                ", valor=" + valor +
                '}';
    }
}
