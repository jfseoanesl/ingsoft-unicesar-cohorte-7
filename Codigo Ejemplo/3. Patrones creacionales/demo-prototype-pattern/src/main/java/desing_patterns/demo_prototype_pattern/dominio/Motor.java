package desing_patterns.demo_prototype_pattern.dominio;

import desing_patterns.demo_prototype_pattern.prorotype.IPrototype;

public class Motor implements IPrototype {
    private String noSerie;
    private int noCaballosFuerza;
    private String tecnologia; // electrico, hibrido, combustible

    public Motor() {
    }

    public Motor(String noSerie, int noCaballosFuerza, String tecnologia) {
        this.noSerie = noSerie;
        this.noCaballosFuerza = noCaballosFuerza;
        this.tecnologia = tecnologia;
    }

    private Motor(Motor m){
        this.noSerie = m.noSerie;
        this.noCaballosFuerza = m.noCaballosFuerza;
        this.tecnologia = m.tecnologia;
    }

    public String getNoSerie() {
        return noSerie;
    }

    public void setNoSerie(String noSerie) {
        this.noSerie = noSerie;
    }

    public int getNoCaballosFuerza() {
        return noCaballosFuerza;
    }

    public void setNoCaballosFuerza(int noCaballosFuerza) {
        this.noCaballosFuerza = noCaballosFuerza;
    }

    public String getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia) {
        this.tecnologia = tecnologia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "noSerie='" + noSerie + '\'' +
                ", noCaballosFuerza=" + noCaballosFuerza +
                ", tecnologia='" + tecnologia + '\'' +
                '}';
    }

    @Override
    public IPrototype clone() {
        return new Motor(this);
    }

    @Override
    public IPrototype deepClone() {
        return this.clone();
    }
}
