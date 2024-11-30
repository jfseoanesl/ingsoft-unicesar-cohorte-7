package desing_patterns.demo_prototype_pattern.servicio;

import desing_patterns.demo_prototype_pattern.dominio.Automovil;
import desing_patterns.demo_prototype_pattern.dominio.Moto;
import desing_patterns.demo_prototype_pattern.dominio.Vehiculo;
import desing_patterns.demo_prototype_pattern.prorotype.Registryprototype;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class ClonarVehiculo {

    public Vehiculo clonarVehiculo(Vehiculo v){
        if(v instanceof Moto){
            Moto moto = new Moto();
            moto.setNoMatricula(v.getNoMatricula());
            moto.setMarca(v.getMarca());
            moto.setModelo(v.getModelo());
            moto.setMotor(v.getMotor());
            moto.setColor(v.getColor());
            moto.setTipoParal(((Moto)v).getTipoParal());
            return moto;
        } else if(v instanceof Automovil){

            Automovil carro = new Automovil();
            carro.setNoMatricula(v.getNoMatricula());
            carro.setMarca(v.getMarca());
            carro.setModelo(v.getModelo());
            carro.setMotor(v.getMotor());
            carro.setColor(v.getColor());
            carro.setNoPuertas(((Automovil)v).getNoPuertas());
            return carro;

        }
        else{
            Vehiculo clonado = new Vehiculo();
            clonado.setNoMatricula(v.getNoMatricula());
            clonado.setMarca(v.getMarca());
            clonado.setModelo(v.getModelo());
            clonado.setMotor(v.getMotor());
            clonado.setColor(v.getColor());
            return clonado;
        }
    }


    public Vehiculo clonacionPrototype(Vehiculo v){

        return Registryprototype.obtenerPrototipo(v.getNoMatricula());

    }
}
