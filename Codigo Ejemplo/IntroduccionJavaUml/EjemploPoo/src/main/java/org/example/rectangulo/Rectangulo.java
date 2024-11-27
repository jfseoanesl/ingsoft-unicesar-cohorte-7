package org.example.rectangulo;

public class Rectangulo {

    // atributos de instancia
    private double base;
    private double altura;

    // atributo de clase - static
    public static int BORDER = 0;
    public static int contadodor =0;

    // constructor
    public Rectangulo(){
        this(0,0);
    }

    public Rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
        contadodor++;
    }

    public Rectangulo(double base){
        this(base,15);
    }

    // getter y setter
    public double getBase(){
        return this.base;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setBase(double base){
        this.base = base;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    //metodos miembros
    public double calcularArea(){
        return this.altura * this.base / 2;
    }

    //
    public double sumarArea(double area){
        return this.calcularArea() + area;
    }

    public double sumarArea(Rectangulo r){
        return this.sumarArea(r.calcularArea());
    }

    public double sumarArea(double base, double altura){
        return this.sumarArea(new Rectangulo(base, altura));
    }

    public double sumarArea(int base){
        return this.sumarArea(base, 0);
    }



    public double calcularPerimetro(){
        return 2 * (this.base + this.altura);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangulo that = (Rectangulo) o;
        return Double.compare(base, that.base) == 0 && Double.compare(altura, that.altura) == 0;
    }




}

