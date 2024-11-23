package org.example.bad;

public class EnvioNacionalPremiumConImpuesto extends EnvioNacionalPremium{
    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 150;
    }
}
