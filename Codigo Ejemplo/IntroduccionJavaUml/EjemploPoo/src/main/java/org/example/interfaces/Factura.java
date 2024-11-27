package org.example.interfaces;

public class Factura implements ILiquidable, IArchivable {

    private double subTotal;
    private double descuento;

    public Factura(double subTotal, double descuento) {
        this.subTotal = subTotal;
        this.descuento = descuento;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "subTotal=" + subTotal +
                ", descuento=" + descuento +
                '}';
    }

    @Override
    public double calcularMontoPago() {
        return this.subTotal - this.descuento;
    }

    @Override
    public double calculaMontoIva() {
        return this.calcularMontoPago() * ILiquidable.IVA;
    }

    @Override
    public void archivar() {

    }
}
