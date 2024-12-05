package clasesGenericas;

public class Main {
    public static void main(String[] args) {
        Dd midd= new Dd(525,"Intel");
        Ram ram= new Ram(8);
        Procesador proc= new Procesador("25");
        Computadora micompu= new Computadora("rojo","laptop",proc,ram,midd);
        micompu.mostrar();

    }
}
