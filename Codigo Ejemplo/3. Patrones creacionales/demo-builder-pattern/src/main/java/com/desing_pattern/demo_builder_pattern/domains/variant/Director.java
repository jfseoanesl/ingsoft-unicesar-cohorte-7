package com.desing_pattern.demo_builder_pattern.domains.variant;

public class Director {

    public void builderEstudiantesSistemasUnicesar(IEstudianteBuilder builder) {
        builder.programa("abc", "Sistemas", "Ingeneirias", "Sabana")
                .edad(30)
                .semestre(7);

    }

}
