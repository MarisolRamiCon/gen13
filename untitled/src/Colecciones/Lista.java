package Colecciones;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List <Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(5);// Agregar elementos al final de la lista
        listaNumeros.add(10);
        listaNumeros.add(25);
        listaNumeros.add(20);
        for(int num: listaNumeros){
            System.out.println(num);
        }
        System.out.println(listaNumeros);
        System.out.println("La lista tiene " + listaNumeros.size() + " elementos"); // Saber el tamaño de la lista
        listaNumeros.add(35);
        System.out.println(listaNumeros);
        listaNumeros.remove(3);
        System.out.println(listaNumeros);
        listaNumeros.set(0,40); //(40,10,25,35)
        System.out.println(listaNumeros);
        listaNumeros.add(0,5); //5,40,10,25,35
        System.out.println(listaNumeros);
        listaNumeros.add(5);
        System.out.println(listaNumeros.get(5)); //5

    }
}

/*
* Wrapper
* int     Integer
* char    Character
* byte    Byte
* short   Short
* long    Long
* float   Float
* double  Double
* boolean    Boolean*/
