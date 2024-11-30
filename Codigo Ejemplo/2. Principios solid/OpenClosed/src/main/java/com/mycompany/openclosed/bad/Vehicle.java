/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.openclosed.bad;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author JAIRO
 */
public abstract class Vehicle {
    
    private String matricule;



    public Vehicle(String matricule) {
        this.matricule = matricule;

    }


    /**
     * @return the matricula
     */
    public String getMatricule() {
        return matricule;
    }

    /**
     * @param matricule the matricula to set
     */
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    

    public abstract double getRate();

    
    
}
