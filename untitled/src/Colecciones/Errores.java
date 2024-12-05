package Colecciones;

public class Errores {
    public static void main(String[] args) {
        int x=3;
        int y=0;
        try{
            double res = x/y;
            System.out.println(res);
        }catch (Exception error){
            System.out.println("No se puede hacer una suma entre cero");
        }finally{
            System.out.println("Fin del programa");
        }


    }
}
