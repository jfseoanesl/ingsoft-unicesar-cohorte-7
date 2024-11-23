package org.example.bad;

public abstract class EnvioNacionalStandard extends EnvioNacional{
    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 50;
    }
}

