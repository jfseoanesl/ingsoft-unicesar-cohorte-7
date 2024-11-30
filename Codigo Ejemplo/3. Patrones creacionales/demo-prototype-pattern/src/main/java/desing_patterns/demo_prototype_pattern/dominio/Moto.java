package desing_patterns.demo_prototype_pattern.dominio;

public class Moto extends Vehiculo{

    private String tipoParal;

    public Moto() {

    }

    public Moto(String noMatricula, String marca, String color, int modelo, Motor motor, String tipoParal) {
        super(noMatricula, marca, color, modelo, motor);
        this.tipoParal = tipoParal;
    }

    public String getTipoParal() {
        return tipoParal;
    }

    public void setTipoParal(String tipoParal) {
        this.tipoParal = tipoParal;
    }

    @Override
    public String toString() {
        return "Moto{" + super.toString() +
                ", tipoParal='" + tipoParal + '\'' +
                '}';
    }
}
