import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Reduce {
    public static void main(String[] args) {
        List<Integer> enteros= new ArrayList<>();
        for(int i=0; i<5; i++){
            enteros.add(i+1);//1+2+3+4+5
        }
        //int suma= enteros.stream().reduce(0,Integer::sum);
        int suma= enteros.stream().reduce(0,(num1,num2)->num1+num2);
        System.out.println(suma);
    }
}
