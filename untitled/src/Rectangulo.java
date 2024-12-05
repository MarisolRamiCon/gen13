public class Rectangulo implements Figura, Simetria{
    private double altura;
    private double base;

    public Rectangulo( double altura, double base){
        this.altura= altura;
        this.base= base;
    }

    public Rectangulo(){

    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return (2*base)+(2*altura);
    }

    @Override
    public boolean esSimetrico() {
        return true;
    }
}
