package org.example.dominio;

public class ScooterElectrica implements IScooter {

    private int kmsAutonomia;

    public ScooterElectrica(int kmsAutonomia) {
        this.kmsAutonomia = kmsAutonomia;
    }

    @Override
    public String getDescripcionScooter() {
        return "Scooter lectrica con " +
                this.kmsAutonomia +
                " km de autonomina";
    }
}
