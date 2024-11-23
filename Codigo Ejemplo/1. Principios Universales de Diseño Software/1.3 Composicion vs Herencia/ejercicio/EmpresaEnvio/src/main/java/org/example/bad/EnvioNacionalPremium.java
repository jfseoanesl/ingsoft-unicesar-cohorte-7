package org.example.bad;

public abstract class EnvioNacionalPremium extends EnvioNacional{
    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 200;
    }
}
