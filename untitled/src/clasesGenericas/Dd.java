package clasesGenericas;

public class Dd {
    private int capacidad;
    private String marca;

    public Dd(int capacidad, String marca) {
        this.capacidad = capacidad;
        this.marca = marca;
    }

    public Dd() {
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
