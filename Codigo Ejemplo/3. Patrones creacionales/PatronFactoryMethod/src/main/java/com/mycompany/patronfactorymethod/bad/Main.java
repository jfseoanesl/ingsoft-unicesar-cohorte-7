/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronfactorymethod.bad;

/**
 *
 * @author JAIRO
 */
public class Main {
    public static void main(String[] args) {
        
        
        
        String tipoCliente="credito";

        Cliente cliente;
        if(tipoCliente.equals("crediito")){
             cliente = new ClienteCredito();
        }else{
            cliente = new ClienteContado();
        }
        
        System.out.println(cliente.crearPedido());
        
    }
    
}
