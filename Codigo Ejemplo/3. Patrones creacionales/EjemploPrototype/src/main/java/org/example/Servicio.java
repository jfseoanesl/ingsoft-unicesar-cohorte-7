package org.example;

public class Servicio {

    public static Vehiculo clonarVehiculo(Vehiculo v){
         if(v instanceof  Vehiculo){
            Vehiculo clon = new Vehiculo();
            clon.setLinea(v.getLinea());
            clon.setMarca(v.getMarca());
            clon.setModelo(v.getModelo());
            clon.setPlaca(v.getPlaca());

             return clon;
         }else{

             Camioneta camioneta = new Camioneta();
             camioneta.setLinea((((Camioneta)(v)).getLinea()));
             camioneta.setMarca((((Camioneta)(v)).getMarca()));
             camioneta.setModelo((((Camioneta)(v)).getModelo()));
             camioneta.setCapacidadCarga((((Camioneta)(v)).getCapacidadCarga()));
             camioneta.setPlaca((((Camioneta)(v)).getPlaca()));
             return camioneta;
         }
    }
}
