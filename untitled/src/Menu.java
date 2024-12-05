import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1. Peliculas ");
        System.out.println("2. Libros ");
        System.out.println("3. Historietas ");
        System.out.println("0.Salir");

        int opcion=0;

        do{
            System.out.println("Ingresa la opción del menu que desees");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 0:
                    System.out.println("Hasta pronto");
                    break;
                case 1:
                    System.out.println("Las peliculas de acción son mis favoritas");
                    break;
                case 2:
                    System.out.println("Mis libros favoritos son de hace muchos años");
                    break;
                case 3:
                    System.out.println("No leo historietas");
                    break;

                default:
                    System.out.println("Esa no es una opción");
                    break;
            }

        }while(opcion!=0);
    }
}
