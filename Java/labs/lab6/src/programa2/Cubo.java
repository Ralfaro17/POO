package programa2;

public class Cubo extends FiguraTridimensional{
    private double lado;
    
    public Cubo(double lado){
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double obtenerArea(){
        return 6 * (lado * lado);
    }

    public double obtenerVolumen(){
        return lado * lado * lado;
    }
}
