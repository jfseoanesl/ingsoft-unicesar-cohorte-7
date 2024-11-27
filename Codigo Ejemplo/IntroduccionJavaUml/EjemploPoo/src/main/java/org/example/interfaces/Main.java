package org.example.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<ILiquidable> porPagar= new ArrayList<>();
        Factura f = new Factura(100000, 5000);
        porPagar.add(f);

        EmpleadoComision e= new EmpleadoComision(5000,0.2);
        porPagar.add(e);

        verCuentasPorPagar(porPagar);

        IArchivable impl = ()->{System.out.println("archivando el elemento");};
        archivar(impl);

        ObjetoDto dto = new ObjetoDto(35, "texto");
        System.out.println(dto.p1());
        System.out.println(dto.p2());
    }

    public static void verCuentasPorPagar(List<ILiquidable> lista){
            double total=0;
            for(ILiquidable l: lista){
                total+=l.calcularMontoPago();
            }
            System.out.println("Total cuentas por pagar: " + total);
    }

    public static void archivar(IArchivable archivo){
        archivo.archivar();
    }

}
