package org.example.domain;

public class Empleado {

    private String id;
    private String nombre;
    private String apellido;
    private int edad;
    private char genero;
    private Cargo cargo;
    private Direccion direccion;
    private Telefono telefono;


    private Empleado() {
    }

    private Empleado(String id, String nombre, String apellido, int edad, char genero, Cargo cargo, Direccion direccion, Telefono telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.genero = genero;
        this.cargo = cargo;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Telefono getTelefono() {
        return telefono;
    }

    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", genero=" + genero +
                ", cargo=" + cargo +
                ", direccion=" + direccion +
                ", telefono=" + telefono +
                '}';
    }

    public static class EmpleadoBuilder implements IBuilder{

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
        public Empleado build() {
            return new Empleado(id,nombre, apellido, edad, genero, cargo, direccion, telefono);
        }
    }


}
