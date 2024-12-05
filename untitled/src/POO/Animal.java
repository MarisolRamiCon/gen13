package POO;

public abstract class Animal {
    protected String nombre;
    protected String color;


    public void comer(){
        System.out.println("Estoy comiendo");
    }

    public abstract void emitirSonido();
}
