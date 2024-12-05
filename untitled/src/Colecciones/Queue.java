package Colecciones;

import java.util.LinkedList;
import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args){
        PriorityQueue<Integer> c1= new PriorityQueue<>();
        c1.offer(5);// offer y add es para añadir elementos al Queue
        c1.offer(50);
        c1.offer(8);
        c1.offer(30);
        c1.add(6);
        int siguienteAtendido=c1.peek(); //peek() nos va a decir quien esta en el frente del queue o quien es el siguiente en atender
        //System.out.println(siguienteAtendido);//5
        int elementoAEliminar=c1.poll(); // nos va a dar el elemento que va a eliminar y lo elimina, el remove() hace algo similar
       System.out.println(elementoAEliminar);
        while(!c1.isEmpty()){
            int elemento= c1.poll();
            System.out.println(elemento);
        }
        System.out.println(c1.poll());// poll() nos da un null si no hay elementos y remove() una excepcion




    }
}
