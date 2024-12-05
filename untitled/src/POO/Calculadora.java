package POO;

public class Calculadora {
    public void suma(){
        int x=3;
        int y=25;
        System.out.println("La suma de "+x+" y "+y +" es " +x+y);
    }
    public void suma(double a, double b){
        System.out.println("La suma de "+a+" + "+b+" = "+ a+b);
    }

    public void suma(int a, int b){
        System.out.println("La suma de "+a+" + "+b+" = "+ a+b);
    }

    public void suma(double... a){
        double suma=0;
        for(double num:a){
            suma+=num;
        }
        System.out.println("La suma de es " + suma);
    }

    public static void main(String[] args) {
        Calculadora micalculadora= new Calculadora();
        micalculadora.suma(8,9,10,11,12);
    }

}
