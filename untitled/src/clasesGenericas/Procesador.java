package clasesGenericas;

public class Procesador {
    private String velocidad;

    public Procesador(String velocidad) {
        this.velocidad = velocidad;
    }

    public Procesador() {
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }
}
