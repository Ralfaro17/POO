package prueba;

public class Punto {
    private double coordX;
    private double coordY;
    
    public Punto(double coordX, double coordY) {
        this.coordX = coordX;
        this.coordY = coordY;
    }

    public double getCoordX() {
        return coordX;
    }

    public void setCoordX(double coordX) {
        this.coordX = coordX;
    }

    public double getCoordY() {
        return coordY;
    }

    public void setCoordY(double coordY) {
        this.coordY = coordY;
    }

    @Override
    public String toString(){
        return String.format("X: %.2f\nY: %.2f\n", getCoordX(), getCoordY());
    }
}
