import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        String nombre;
        int edad;
        System.out.println("Ingresa tu nombre");
        Scanner entrada= new Scanner(System.in);
        nombre= entrada.nextLine();
        System.out.println("Ingresa tu edad");
        edad= entrada.nextInt();
        System.out.println("Tu nombre es "+ nombre+" y tu edad es "+edad);


    }
}
