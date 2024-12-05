public class Animal {
    String nombre;
    int edad;

    public Animal(String nombre, int edad){
        this.nombre = nombre;
        this.edad= edad;
    }

    public static void main(String[] args) {
        Animal animal1 = new Animal("Bombon",3);
       int edadAnimal= animal1.edad;
        System.out.println(edadAnimal);
    }

}
