package org.example;

import org.example.domain.Direccion;
import org.example.domain.Empleado;
import org.example.variante.Director;
import org.example.variante.EmpleadoBuilder;

public class Main {
    public static void main(String[] args) {

        Empleado empleado = new Empleado.EmpleadoBuilder()
                            .apellido("seoanes")
                            .id("123")
                            .cargo("docente", 123455)
                            .genero('m')
                            .edad(35).nombre("jairo")
                            .build();


        EmpleadoBuilder builder = new EmpleadoBuilder();
        Director director = new Director();
        director.crearDocenteUnicesar(builder);

        builder.nombre("jairo");
        System.out.println(builder.build());
        builder.nombre("jose");
        System.out.println(builder.build());
        builder.nombre("paco");
        System.out.println(builder.build());
    }
}