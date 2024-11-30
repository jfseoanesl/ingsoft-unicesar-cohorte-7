/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Postcondiciones.bad;



/**
 *
 * @author JAIRO
 */
public class CuentaBancaria {
    
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public CuentaBancaria() {
    }
    
    

    /**
     * @return the saldo
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double monto){
        this.saldo+=monto;
    }
    
}
