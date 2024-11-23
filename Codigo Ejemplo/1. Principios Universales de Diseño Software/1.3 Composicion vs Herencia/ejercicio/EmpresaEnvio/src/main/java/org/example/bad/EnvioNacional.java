package org.example.bad;

public abstract class EnvioNacional extends Envio{
    @Override
    public double calcularCostoEnvio() {
        return 100;
    }
}
