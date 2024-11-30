package desing_patterns.demo_prototype_pattern.dominio;

import desing_patterns.demo_prototype_pattern.prorotype.IPrototype;

public class Automovil extends Vehiculo  {
    private int noPuertas;

    public Automovil() {

    }

    public Automovil(String noMatricula, String marca, String color, int modelo, Motor motor, int noPuertas) {
        super(noMatricula, marca, color, modelo, motor);
        this.noPuertas = noPuertas;
    }

    private Automovil(Automovil a){

    }

    public int getNoPuertas() {
        return noPuertas;
    }

    public void setNoPuertas(int noPuertas) {
        this.noPuertas = noPuertas;
    }

    @Override
    public String toString() {
        return "Automovil{" + super.toString() +
                ", noPuertas=" + noPuertas +
                '}';
    }

    @Override
    public IPrototype clone() {
        return null;
    }

    @Override
    public IPrototype deepClone() {
        return null;
    }
}
