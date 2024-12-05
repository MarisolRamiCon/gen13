package clasesGenericas;

public class Computadora {
    private String color;
    private String tipo;
    private Procesador procesador;
    private Ram miram;
    private Dd midiscoduro;

    public Computadora(String color, String tipo, Procesador procesador, Ram miram, Dd midiscoduro) {
        this.color = color;
        this.tipo = tipo;
        this.procesador = procesador;
        this.miram = miram;
        this.midiscoduro = midiscoduro;
    }

    public Computadora() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Procesador getProcesador() {
        return procesador;
    }

    public void setProcesador(Procesador procesador) {
        this.procesador = procesador;
    }

    public Ram getMiram() {
        return miram;
    }

    public void setMiram(Ram miram) {
        this.miram = miram;
    }

    public Dd getMidiscoduro() {
        return midiscoduro;
    }

    public void setMidiscoduro(Dd midiscoduro) {
        this.midiscoduro = midiscoduro;
    }

    public void mostrar(){
        System.out.println(" Mi " +getTipo()+" tiene "+ getMiram().getCapacidad() +" gb de memoria RAM");
    }
}
