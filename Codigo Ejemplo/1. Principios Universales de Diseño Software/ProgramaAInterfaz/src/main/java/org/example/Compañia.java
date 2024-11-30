package org.example;

import java.util.List;

public class Compañia {

    private List<ITrabajador> equipo;

    public Compañia(List<ITrabajador> equipo) {
        this.equipo = equipo;
    }

    public void addTrabajador(ITrabajador t){
        this.equipo.add(t);
    }

    public void  desarrolalrTarea(){
        for(ITrabajador t : this.equipo){
            t.desarrollarTarea();
        }
    }
}
