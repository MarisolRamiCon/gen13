package clasesGenericas;

public class Chocolate {
    private String nombre;
    private String tipo;

    public Chocolate(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public Chocolate() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void Mostrar(){
        System.out.println("Nombre: "+getNombre());
        System.out.println("Tipo: " + getTipo());
    }
}
