package POO;

public class Perro extends Animal{
    //Atributos
    // Modificadores de acceso son public, private, protected y default
   //private String nombre;
    private String raza;
   // private String color;

    //Metodo constructor que es aquel que me permite inicializar los atributos.
    public Perro(String nombre,String raza, String color){
        this.nombre= nombre;
        this.raza= raza;
        this.color=color;
    }
    //metodo constructor sin argumentos
    public Perro(){

    }

    //Colocar getters(obtener los atributos asignados) y setters(para asignar o para modificar)
    public String  getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre= nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Estoy realizando los metodos de la clase
   /* public void comer(){
        System.out.println("El perro esta comiendo");
    }

    public void ladrar(){
        System.out.println("El perro esta ladrando");
    }*/

    @Override
    public void emitirSonido() {
        System.out.println("Estoy ladrando");
    }

}
