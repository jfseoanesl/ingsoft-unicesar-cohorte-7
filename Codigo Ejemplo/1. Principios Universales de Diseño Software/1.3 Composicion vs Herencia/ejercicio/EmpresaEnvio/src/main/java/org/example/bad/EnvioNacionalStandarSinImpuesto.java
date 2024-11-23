package org.example.bad;

public class EnvioNacionalStandarSinImpuesto  extends EnvioNacionalStandard{
    @Override
    public double calcularCostoEnvio() {
        return super.calcularCostoEnvio()+0;
    }
}
