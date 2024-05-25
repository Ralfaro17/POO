package programa1;

public class Trapezoide extends Cuadrilatero{
    public Trapezoide(Punto[] puntos){
        super(puntos);
    }

    public double calcularArea() throws Exception{
        double baseSuperior = getPuntoUnico(1).getCoordX() - getPuntoUnico(0).getCoordY();
        double baseInferior = getPuntoUnico(2).getCoordX() - getPuntoUnico(3).getCoordY();
        double altura = getPuntoUnico(1).getCoordY() - getPuntoUnico(2).getCoordY();
        return ((baseSuperior + baseInferior) * altura) / 2;
    }
}
