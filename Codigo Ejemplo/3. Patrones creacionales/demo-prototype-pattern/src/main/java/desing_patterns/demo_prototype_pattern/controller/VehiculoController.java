package desing_patterns.demo_prototype_pattern.controller;

import desing_patterns.demo_prototype_pattern.dominio.Moto;
import desing_patterns.demo_prototype_pattern.dominio.Motor;
import desing_patterns.demo_prototype_pattern.dominio.Vehiculo;
import desing_patterns.demo_prototype_pattern.prorotype.Registryprototype;
import desing_patterns.demo_prototype_pattern.servicio.ClonarVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class VehiculoController {
    @Autowired
    private ClonarVehiculo servicio;
    private Vehiculo prototipo = new Vehiculo("123", "Toyota",
            "Rojo", 2023,
            new Motor("abc",2000, "Hibrido"));

    @GetMapping
    public Vehiculo getVehiculo(){

        Moto moto = new Moto("123", "Toyota",
                "Rojo", 2023,
                new Motor("abc",2000, "Hibrido"),
                "Central");

        Registryprototype.agregarPrototypo(this.prototipo);
        Registryprototype.agregarPrototypo(moto);

        Vehiculo nuevoVehiculo = this.servicio.clonacionPrototype(moto);
        Vehiculo otroVehiculo = this.servicio.clonacionPrototype(moto);
        nuevoVehiculo.getMotor().setTecnologia("Gasolina");

        return otroVehiculo;
    }
}
