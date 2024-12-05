public class Funciones {

    public static double resta(double a, double b){
        double resultado;
        resultado= a-b;
        return resultado;
    }

    public static int suma ( int... nums){
        int suma=0;
        for(int n:nums){
            suma+=n;
        }
        return suma;
    }


    public static void main(String[] args) {
        double f=5, g=3;
        double r=resta(f,g);
        int t=suma((int)f,(int)g,10,9);
        System.out.println("La resta es "+r);
        Funciones func= new Funciones();
        int s= func.suma((int) f,(int)g);
        System.out.println(s);
        System.out.println(t);

    }
}
