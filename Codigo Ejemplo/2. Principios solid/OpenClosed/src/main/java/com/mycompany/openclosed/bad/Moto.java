package com.mycompany.openclosed.bad;

public class Moto extends Vehicle{

    public Moto(String matricule) {
        super(matricule);
    }

    @Override
    public double getRate() {
        return 1000;
    }
}
