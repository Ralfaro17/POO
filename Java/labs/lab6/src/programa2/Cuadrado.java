package programa2;

public class Cuadrado extends FiguraBidimensional{
    private double lado;

    public Cuadrado(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double obtenerArea(){
        return lado * lado;
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVolumen'");
    }
}
