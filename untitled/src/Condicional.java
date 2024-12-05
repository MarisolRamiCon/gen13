import java.util.Scanner;

public class Condicional {
    public static void main(String[] args) {
        // Es el ejemplo de numeros positivos y negativos
        Scanner entrada= new Scanner(System.in);
        int numero;
        System.out.println("Ingresa un numero");
        numero= entrada.nextInt();
        if(numero>=0){
            System.out.println("El numero es positivo");
        }else{
            System.out.println("El número es negativo");
        }
    }
}
