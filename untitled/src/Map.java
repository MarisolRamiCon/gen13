import java.util.ArrayList;
import java.util.List;

public class Map {
    public static void main(String[] args) {
        // Poder obtener el cuadrado de cada uno de los elementos de mi lista
        List<Integer> numer = new ArrayList<>();
        for(int i = 0; i <10; i++){
            numer.add(i +1);
        }
        List<Integer> cuadrados= numer.stream().map(numero->numero*numero).toList();
        System.out.println(cuadrados);

    }
}
