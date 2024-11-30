package herencia;

public class ClaseB {

    private int atributo2;
    private ClaseA claseA;

    public ClaseB(int atributo1, int atributo2) {
         this.atributo2 = atributo2;
         claseA = new ClaseA(atributo1);
    }

    public int getAtributo2() {
        return atributo2;
    }

    public void setAtributo2(int atributo2) {
        this.atributo2 = atributo2;
    }

    public double sume(){
        return this.claseA.getAtributo1() + this.atributo2;
    }
}
