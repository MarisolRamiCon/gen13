package clasesGenericas;


public class Principal {
    public static void main(String[] args) {
        Bolsa<Chocolate> bolsaDeChocolates= new Bolsa<>();
        Bolsa<Soda> bolsaDeSoda= new Bolsa<>();
        bolsaDeChocolates.add(new Chocolate("Chocolate 1", "negro"));
        bolsaDeChocolates.add(new Chocolate("Chocolate 2", "blanco"));
        bolsaDeChocolates.add(new Chocolate("Chocolate 3", "almendrado"));
        bolsaDeSoda.add(new Soda("Soda 1", "Limon"));
        bolsaDeSoda.add(new Soda("Soda 2","fresa"));
        bolsaDeSoda.add(new Soda("Soda 3", "vainilla"));
        bolsaDeChocolates.getBolsa().stream().forEach(chocolate -> System.out.println(chocolate.getNombre() +" "+ chocolate.getTipo()));
        bolsaDeSoda.getBolsa().stream().forEach(soda -> System.out.println(soda.getNombre() +" "+ soda.getSabor()));
    }
}
