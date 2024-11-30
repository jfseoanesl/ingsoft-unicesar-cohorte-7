package desing_patterns.demo_prototype_pattern.prorotype;

import desing_patterns.demo_prototype_pattern.dominio.Vehiculo;

import java.util.HashMap;
import java.util.Map;

public class Registryprototype {

    private static Map<String, IPrototype> prototipos = new HashMap<>();

    public static void agregarPrototypo(Vehiculo v){
        prototipos.put(v.getNoMatricula(), v);
    }

    public static Vehiculo obtenerPrototipo(String noMatricula){
            Vehiculo clone = (Vehiculo)prototipos.get(noMatricula).deepClone();
            return clone;
    }
}
