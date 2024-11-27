package org.example.polimorfismo;

public class EmpleadoComision extends Empleado{

    private double ventasMensuales;
    private double pComision;

    public EmpleadoComision(String nombre, String apellido, double ventasMensuales, double pComision) {
        super(nombre, apellido);
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
                super.toString() +
                ", ventasMensuales=" + ventasMensuales +
                ", pComision=" + pComision +
                '}';
    }

    @Override
    public double calcularSalario() {
        return this.ventasMensuales * this.pComision;
    }
}
