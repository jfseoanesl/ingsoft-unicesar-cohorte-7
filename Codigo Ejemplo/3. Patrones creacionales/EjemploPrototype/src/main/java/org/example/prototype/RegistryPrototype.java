package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

public class RegistryPrototype {

    private static Map<String, IPrototype> prototipos = new HashMap();

    public static void addPrototype(String name, IPrototype prototype){

                prototipos.put(name, prototype);

    }

    public static IPrototype getPrototype(String name){

        return prototipos.get(name).deepClone();

    }

}
