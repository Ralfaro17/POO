package programa2;

import java.lang.Math;

public class Circulo extends FiguraBidimensional{
    private double radio;

    public Circulo(double radio){
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double obtenerArea(){
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double obtenerVolumen() {
        throw new UnsupportedOperationException("Unimplemented method 'obtenerVolumen'");
    }
}
