import java.util.Scanner;

public class Arreglo {
    public static void main(String[] args) {
        /*byte [] edades= new byte[4]; //inicializando mi arreglo
        edades[0]=10;
        edades[1]=20;
        edades[2]=45;
        edades[3]=10;
        */
        Scanner entrada= new Scanner(System.in);
        byte[] edades ={10,20,45,10};
        //System.out.println(edades);

        edades[1]=33;
        for(byte num: edades){
            System.out.print( num+ " ");
        }

        String [] nombres= new String[5];//longitud de mi arreglo será de 5 elementos
        for(int i=0; i<nombres.length;i++){
            String nombre;
            System.out.println("Escribe el nombre del usuario "+ (i+1));
            nombre= entrada.nextLine();
            nombres[i]= nombre;
        }
        for(String nombre: nombres){
            System.out.println(nombre);
        }


    }


}
