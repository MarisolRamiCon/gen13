import java.util.ArrayList;
import java.util.List;


public class Lambda {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        for(int indice=0; indice<10; indice++){
            numeros.add(indice+1);
        }
        List<Integer> numerospares= numeros.stream().filter(numero->numero%2==0).toList();
        System.out.println(numerospares);

    }
}
