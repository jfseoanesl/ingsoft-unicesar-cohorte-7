package org.example;

import org.example.dominio.ClienteContado;
import org.example.dominio.ClienteCredito;
import org.example.dominio.ICliente;
import org.example.dominio.Pedido;
import org.example.factorymethod.AbstractFactory;
import org.example.factorymethod.ClienteContadoFactory;
import org.example.factorymethod.ClienteCreditoFactory;
import org.example.factorymethod.Factory;

public class Main {
    public static void main(String[] args) {

        String formaPago = "contado";
        //AbstractFactory factory = Factory.crearFactory(formaPago);
        AbstractFactory factory=null;
        factory = configuracion(formaPago);
        ICliente cliente = factory.crearCliente();

        if(cliente!=null){
            Pedido pedido = cliente.crearPedido();
            System.out.println(pedido);
        }

    }

    public static AbstractFactory configuracion(String formaPago){
        switch(formaPago){
            case "contado": return new ClienteContadoFactory();
            case "credito": return new ClienteCreditoFactory();
            default:  return null;
        }
    }
}