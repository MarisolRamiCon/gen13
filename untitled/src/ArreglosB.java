import java.lang.reflect.Array;

public class ArreglosB {
    public static void main(String[] args) {
        int [][] ventas = new int[3][2]; // el primer corchete pertenece a las filas y el segundo a las columnas
        for(int filas=0; filas<3;filas++){
            for (int col=0; col<2; col++){
                System.out.print("["+filas+"] "+"["+col+"]  ");
            }
            System.out.println(" ");
        }

    }
}
