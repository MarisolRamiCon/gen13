package Colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Conjuntos {
    public static void main(String[] args) {
        Set<String> conjunto1= new HashSet<>();
        // el metodo add es para agregar datos
        conjunto1.add("Elena");
        conjunto1.add("Vanesa");
        conjunto1.add("Héctor");
        conjunto1.add("Luis");
        conjunto1.add("Vanesa");
        System.out.println(conjunto1);
        conjunto1.remove("Héctor");
        System.out.println(conjunto1);
        System.out.println(conjunto1.isEmpty());

        Set <String> conjunto2= new TreeSet<>();
        conjunto2.add("Elena");
        conjunto2.add("Vanesa");
        conjunto2.add("Héctor");
        conjunto2.add("luis");
        System.out.println(conjunto2);

        for (String nombre: conjunto2){
            System.out.println(nombre);
        }
//El LinkedHashSet es el menos utilizado
        Set<String> conjunto3 = new LinkedHashSet<>();
        conjunto3.add("Elena");
        conjunto3.add("Vanesa");
        conjunto3.add("Héctor");
        conjunto3.add("luis");
        System.out.println(conjunto3);


    }
}
