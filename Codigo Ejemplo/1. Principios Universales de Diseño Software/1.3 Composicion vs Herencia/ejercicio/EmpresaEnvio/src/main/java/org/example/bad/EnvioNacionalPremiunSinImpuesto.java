package org.example.bad;

public class EnvioNacionalPremiunSinImpuesto extends EnvioNacionalPremium {
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio() + 0;
    }
}
