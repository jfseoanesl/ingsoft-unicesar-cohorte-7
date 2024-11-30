package org.example.domain;

public class Telefono {

    private String indicativo;
    private String numero;

    public Telefono(String indicativo, String numero) {
        this.indicativo = indicativo;
        this.numero = numero;
    }

    public String getIndicativo() {
        return indicativo;
    }

    public void setIndicativo(String indicativo) {
        this.indicativo = indicativo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public String toString() {
        return "Telefono{" +
                "indicativo='" + indicativo + '\'' +
                ", numero='" + numero + '\'' +
                '}';
    }
}
