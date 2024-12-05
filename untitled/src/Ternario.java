import java.util.Scanner;

public class Ternario {
    public static void main(String[] args) {
        //personas mayores de edad y menores de edad
        Scanner entrada= new Scanner(System.in);
        int edad;
        System.out.println("Ingresa tu edad");
        edad= entrada.nextInt();
        String condicion;
        condicion= (edad<18) ? "Eres menor de edad" : "Eres mayor de edad";
        System.out.println(condicion);
    }
}
