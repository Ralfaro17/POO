package programa2;

public class Triangulo extends FiguraBidimensional{
    private double base;
    private double altura;

    public Triangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double obtenerArea(){
        return (base * altura) / 2;
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVolumen'");
    }
}
