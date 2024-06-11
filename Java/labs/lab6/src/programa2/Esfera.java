package programa2;

import java.lang.Math;

public class Esfera extends FiguraTridimensional {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    public double obtenerVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }   
}
