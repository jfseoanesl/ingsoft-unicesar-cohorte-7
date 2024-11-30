package org.example.simplefactory;

import org.example.dominio.ClienteContado;
import org.example.dominio.ClienteCredito;
import org.example.dominio.ICliente;

public class Factory {

    public static ICliente crearCliente(String formaPago){

        switch(formaPago){
            case "contado": return new ClienteContado();

            case "credito": return new ClienteCredito();

            default:
                System.out.println("Forma de pago no definida");
                return null;
        }

    }
}
