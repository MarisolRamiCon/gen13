public class Principal {
    public static void main(String[] args) {
        Hilo proceso1= new Hilo();
        proceso1.start();
        Hilo2 pr2=new Hilo2();
        Thread proceso2=new Thread(pr2) ;
        proceso2.start();


    }



}
