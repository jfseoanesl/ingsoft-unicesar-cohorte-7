package org.example.dominio;

public class AutomovilElectrico implements IAutomovil{
        private int autonomiaKms;

    public AutomovilElectrico(int autonomiaKms) {
        this.autonomiaKms = autonomiaKms;
    }

    @Override
    public String getDescripcionAutomovil() {
        return " Automovil electrico con " +
                this.autonomiaKms +
                " kms de autonomia ";
    }
}
