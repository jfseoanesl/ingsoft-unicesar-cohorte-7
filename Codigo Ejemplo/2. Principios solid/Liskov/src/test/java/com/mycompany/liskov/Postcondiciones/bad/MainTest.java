package com.mycompany.liskov.Postcondiciones.bad;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testDepositar(){
        CuentaBancaria cuenta = new CuentaRetiro();
        cuenta.depositar(1000);
        assertEquals(1000, cuenta.getSaldo(), 0);
    }

    @Test
    public void testRetirar(){
        CuentaRetiro cuenta = new CuentaRetiro();
        cuenta.depositar(1000);
        cuenta.retirar(500);
        assertEquals(500, cuenta.getSaldo(), 0);

    }


}