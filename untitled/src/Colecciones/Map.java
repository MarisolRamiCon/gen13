package Colecciones;

import java.util.HashMap;
import java.util.TreeMap;

public class Map {
    public static void main(String[] args) {
        TreeMap<Integer, String> numeros= new TreeMap<Integer,String>();
        // para ingresar datos vamos a utilizar el metodo put(clave,valor)
        numeros.put(11,"once");
        numeros.put(23,"veintitres");
        numeros.put(56,"cincuenta y seis");
        System.out.println(numeros);
        //para obtener un valor usamos la clave y se utiliza el metodo get(clave)
        System.out.println(numeros.get(1));
        // para eliminar el valor usamos remove(clave)
        System.out.println(numeros.remove(3));
        System.out.println(numeros);
        System.out.println("El numero 4 esta en el Map? "+ numeros.containsKey(4));
        for(Integer val: numeros.keySet()){
            System.out.println(val + "->"+ numeros.get(val));
        }


    }
}
