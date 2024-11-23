package org.example.bad;

public class EnvioNacionalStandardConImpuesto extends EnvioNacionalStandard{
    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 100;
    }
}
