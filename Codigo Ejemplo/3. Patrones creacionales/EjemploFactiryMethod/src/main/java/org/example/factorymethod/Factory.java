package org.example.factorymethod;

public class Factory {

    public static AbstractFactory crearFactory(String formaPago){

        switch(formaPago){
            case "contado": return new ClienteContadoFactory();
            case "credito": return new ClienteCreditoFactory();
            default:  return null;
        }

    }

}
