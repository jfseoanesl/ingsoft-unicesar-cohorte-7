package org.example.variante;

import org.example.domain.Empleado;

public class Director {
    public Director() {
    }

    public void crearDocenteUnicesar(EmpleadoBuilder builder){
        builder.cargo("docente", 12345);
        builder.direccion("valledupar", "unicesar");
        builder.telefono("300", "1000000");
    }
}
