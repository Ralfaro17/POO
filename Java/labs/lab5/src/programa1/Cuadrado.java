package programa1;

public class Cuadrado extends Cuadrilatero{
    public Cuadrado(Punto[] puntos){
        super(puntos);
    }

    public double calcularArea() throws Exception{
        double lado = getPuntoUnico(1).getCoordX() - getPuntoUnico(0).getCoordX();
        return lado * lado;
    }
}
