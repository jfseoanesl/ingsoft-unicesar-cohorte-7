package org.example.abstractfactory;

import org.example.dominio.IAutomovil;
import org.example.dominio.IScooter;

public interface AbstractFactory {

    IScooter crearScooter();
    IAutomovil crearAutomovil();

}
