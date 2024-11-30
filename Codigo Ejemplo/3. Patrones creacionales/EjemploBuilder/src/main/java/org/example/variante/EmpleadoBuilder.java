package org.example.variante;

import org.example.domain.Cargo;
import org.example.domain.Direccion;
import org.example.domain.Telefono;

public class EmpleadoBuilder implements IBuilder_ {

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private Cargo cargo;
    private Direccion direccion;
    private Telefono telefono;

    public EmpleadoBuilder() {
    }

    public EmpleadoBuilder id(String id){
        this.id = id;
        return  this;
    }

    public EmpleadoBuilder nombre(String nombre){
        this.nombre = nombre;
        return  this;
    }

    public EmpleadoBuilder apellido(String apellido){
        this.apellido = apellido;
        return  this;
    }

    public EmpleadoBuilder edad(int edad){
        this.edad = edad;
        return  this;
    }

    public EmpleadoBuilder genero(char genero){
        this.genero = genero;
        return  this;
    }

    public EmpleadoBuilder cargo(String descripcion, double salario){
        this.cargo = new Cargo(descripcion, salario);
        return  this;
    }

    public EmpleadoBuilder telefono(String indicativo, String numero){
        this.telefono = new Telefono(indicativo, numero);
        return  this;
    }

    public EmpleadoBuilder direccion(String ciudad, String barrio){
        this.direccion = new Direccion(ciudad, barrio);
        return  this;
    }

    @Override
    public Empleado_ build() {
        return new Empleado_(id,nombre, apellido, edad, genero, cargo, direccion, telefono);
    }
}
