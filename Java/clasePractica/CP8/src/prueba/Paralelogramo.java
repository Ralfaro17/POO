package prueba;

public class Paralelogramo extends Cuadrilatero{
    public Paralelogramo(Punto[] puntos){
        super(puntos);
    }

    public double calcularArea() throws Exception{
        double base = getPuntoUnico(1).getCoordX() - getPuntoUnico(0).getCoordX();
        double altura = getPuntoUnico(1).getCoordY() - getPuntoUnico(2).getCoordY();
        return base*altura;
    }
}
