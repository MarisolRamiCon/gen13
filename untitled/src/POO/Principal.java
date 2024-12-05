package POO;

public class Principal {
    public static void main(String[] args) {
        //instanciando a la clase Perro o creando un objeto de esta clase
        Perro perrito= new Perro("Terry","Mestizo","negro");
        perrito.comer();
        perrito.emitirSonido();
        String nombre=perrito.getNombre();
        System.out.println("El nombre del Perro es "+ nombre);
        Perro perrito2= new Perro();

    }
}
