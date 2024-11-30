package dessing_pattern.demo_singleton_pattern.domain;

public class PresidenteSingleton {

    private String nombre;
    private int edad;
    private String partidoPolitico;
    private String pais;
    private int inicioPeriodoMandato;
    private int finPeriodoMandato;
    private double popularidad;

    private static PresidenteSingleton instancia;

    private PresidenteSingleton(String nombre, int edad, String partidoPolitico, String pais, int inicioPeriodoMandato, int finPeriodoMandato, double popularidad) {
        this.nombre = nombre;
        this.edad = edad;
        this.partidoPolitico = partidoPolitico;
        this.pais = pais;
        this.inicioPeriodoMandato = inicioPeriodoMandato;
        this.finPeriodoMandato = finPeriodoMandato;
        this.popularidad = popularidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPartidoPolitico() {
        return partidoPolitico;
    }

    public void setPartidoPolitico(String partidoPolitico) {
        this.partidoPolitico = partidoPolitico;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getInicioPeriodoMandato() {
        return inicioPeriodoMandato;
    }

    public void setInicioPeriodoMandato(int inicioPeriodoMandato) {
        this.inicioPeriodoMandato = inicioPeriodoMandato;
    }

    public int getFinPeriodoMandato() {
        return finPeriodoMandato;
    }

    public void setFinPeriodoMandato(int finPeriodoMandato) {
        this.finPeriodoMandato = finPeriodoMandato;
    }

    public double getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(double popularidad) {
        this.popularidad = popularidad;
    }

    public static PresidenteSingleton getInstancia() {
        return instancia;
    }

    public static void setInstancia(PresidenteSingleton instancia) {
        PresidenteSingleton.instancia = instancia;
    }

    @Override
    public String toString() {
        return "PresidenteSingleton{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", partidoPolitico='" + partidoPolitico + '\'' +
                ", pais='" + pais + '\'' +
                ", inicioPeriodoMandato=" + inicioPeriodoMandato +
                ", finPeriodoMandato=" + finPeriodoMandato +
                ", popularidad=" + popularidad +
                '}';
    }

    // Singleton
    public static PresidenteSingleton getInstance(){
        if(instancia==null){
            instancia = new PresidenteSingleton("Gustavo Petro",
                    64,"Colombia Humana","Colombia",
                    2023, 2026,0.5);
        }
        return  instancia;
    }
}
