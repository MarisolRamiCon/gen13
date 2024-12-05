package clasesGenericas;

import java.util.ArrayList;
import java.util.List;

public class Bolsa <T>{
    private List<T> bolsa= new ArrayList<T>();

    public void add(T producto){
        bolsa.add(producto);
    }

    public List<T> getBolsa(){
        return bolsa;
    }
}
