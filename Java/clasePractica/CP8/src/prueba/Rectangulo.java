package prueba;

public class Rectangulo extends Cuadrilatero{
    public Rectangulo(Punto[] puntos) {
        super(puntos);
    }
    
    public double calcularArea() throws Exception{
        double base = getPuntoUnico(1).getCoordX() - getPuntoUnico(0).getCoordX();
        double altura = getPuntoUnico(1).getCoordY() - getPuntoUnico(2).getCoordY();
        return base*altura;
    }
}
