/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Postcondiciones.bad;

/**
 *
 * @author JAIRO
 */
public class Main {
    
    public static void main(String[] args) {
        
        CuentaRetiro cuenta = new CuentaRetiro();
        cuenta.depositar(1000);
        cuenta.retirar(950);
        System.out.println("Saldo: " + cuenta.getSaldo());
        
    }
    
}
