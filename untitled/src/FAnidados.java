import java.util.Scanner;

public class FAnidados {
    public static void main(String[] args) {
        int filas;
        int columnas;
        Scanner entrada= new Scanner(System.in);
        System.out.println("Ingresa filas");
        filas= entrada.nextInt();
        System.out.println("Ingresa columnas");
        columnas= entrada.nextInt();
        for(int i=0; i<filas; i++){
            for (int j=0; j<columnas; j++){
                System.out.print(j + " ");
            }
            System.out.println(" ");
        }
    }
}
