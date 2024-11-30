package com.mycompany.openclosed.bad;

public class Carro extends  Vehicle{

    public Carro(String matricule) {
        super(matricule);
    }

    @Override
    public double getRate() {
        return 2000;
    }
}
