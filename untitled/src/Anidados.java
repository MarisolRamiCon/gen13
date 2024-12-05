import java.util.Scanner;

public class Anidados {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float calificacion;
        int asistencia;
        System.out.println("Ingresa tu calificación");
        calificacion= entrada.nextFloat();
        System.out.println("Ingresa tu asistencia");
        asistencia= entrada.nextInt();
        if(calificacion>=7 || asistencia>=75){ //calificacion=7  asistencia=70
                System.out.println("Aprobaste");
        }else{
            System.out.println("No aprobaste");
        }
    }

}
