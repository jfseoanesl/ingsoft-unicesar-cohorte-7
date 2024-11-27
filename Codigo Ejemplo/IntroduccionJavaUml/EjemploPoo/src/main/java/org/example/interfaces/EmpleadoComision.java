package org.example.interfaces;

public class EmpleadoComision implements ILiquidable {

    private double ventasMensuales;
    private double pComision;

    public EmpleadoComision(double ventasMensuales, double pComision) {
        this.ventasMensuales = ventasMensuales;
        this.pComision = pComision;
    }

    public double getVentasMensuales() {
        return ventasMensuales;
    }

    public void setVentasMensuales(double ventasMensuales) {
        this.ventasMensuales = ventasMensuales;
    }

    public double getpComision() {
        return pComision;
    }

    public void setpComision(double pComision) {
        this.pComision = pComision;
    }

    @Override
    public String toString() {
        return "EmpleadoComision{" +
                "ventasMensuales=" + ventasMensuales +
                ", pComision=" + pComision +
                '}';
    }


    public double calcularSalario() {

        return this.ventasMensuales * this.pComision;
    }

    @Override
    public double calcularMontoPago() {
        return this.calcularSalario();
    }

    @Override
    public double calculaMontoIva() {
        return this.calcularSalario()*ILiquidable.IVA;
    }
}
