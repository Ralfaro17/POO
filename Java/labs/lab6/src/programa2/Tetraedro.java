package programa2;

import java.lang.Math;

public class Tetraedro extends FiguraTridimensional{
    private double arista;

    public Tetraedro(double arista){
        this.arista = arista;
    }

    public double getArista() {
        return arista;
    }

    public void setArista(double arista) {
        this.arista = arista;
    }

    public double obtenerArea(){
        return (Math.pow(arista, 2) * Math.sqrt(3));
    }

    public double obtenerVolumen(){
        return (Math.pow(arista, 3) * Math.sqrt(2)) / 12;
    }
}
