/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.liskov.Postcondiciones.bad;


/**
 *
 * @author JAIRO
 */
public class CuentaRetiro extends CuentaBancaria {
    public CuentaRetiro(double saldo) {
        super(saldo);
    }

    public CuentaRetiro() {
    }


    public void retirar(double monto) {

            if(monto<=0)
                throw new IllegalArgumentException("Monto no permitido");

            if(this.getSaldo()<monto)
                throw new IllegalArgumentException("Saldo insuficiente");

            this.setSaldo(this.getSaldo()-monto);

    }

    
    
    
    
    
}
