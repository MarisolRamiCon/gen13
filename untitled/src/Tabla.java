import java.util.Scanner;

public class Tabla {
    public static void main(String[] args) {
        int tabla;
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿Que tabla de multiplicar deseas?");
        tabla= entrada.nextInt();
        /*
        * 5x1=5 ..... 5x10=50*/
        for(int i=1;i<=10; i++){
            int resultado;
            resultado= tabla * i;
            System.out.println(tabla + " x " + i +" = " +resultado+ " ");

        }


    }
}
