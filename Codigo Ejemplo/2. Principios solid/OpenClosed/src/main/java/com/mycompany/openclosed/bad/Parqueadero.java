package com.mycompany.openclosed.bad;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Parqueadero {

    public double calculateParkingCost(LocalTime income, LocalTime exit, Vehicle v){
        long hours = ChronoUnit.HOURS.between(exit, income);
        double cost=hours * v.getRate();

        return  cost;
    }
}
