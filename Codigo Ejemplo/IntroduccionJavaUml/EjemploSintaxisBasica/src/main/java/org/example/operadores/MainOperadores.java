package org.example.operadores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainOperadores {

    public static void main(String[] args) {

        int x=10;
        int y = 20;
        int z = 25;

        double res = (double)10 + x / 20 * z - y;
        System.out.println(res);

        System.out.println(!(x==y));
        System.out.println(y!=z & z<x);
        System.out.println(x>z && x>y);
        System.out.println(y<x);
        System.out.println(z<=y);
        System.out.println(y>=x);

        int a=10;
        int pos = a++;
        System.out.println(pos);

        System.out.println(5&2);

        int array[] = {1,2,3,4,5,6};
        System.out.println(array.length);

       

        for(int i=0; i< array.length;i++){
            System.out.println(i);
        }
        //List<String> palabras = Arrays.asList("hola", "mundo", "java");
        List<String> palabras = new ArrayList<>();
        palabras.add("hola");
        palabras.add("mundo");
        palabras.add("java");
        for(String s: palabras){
            System.out.println(s);
        }

        Iterator<String> it = palabras.iterator();
        while (it.hasNext()){
             String leido = it.next();
             if(leido.equals("hola")){
                 it.remove();
             }
         }
        System.out.println(palabras);
    }
}
