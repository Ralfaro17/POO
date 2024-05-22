package prueba;

import javax.swing.JOptionPane;

public class PruebaFiguras{
    public static void main(String[] args) throws Exception {
        Punto[] puntos = {new Punto(0, 2), new Punto(2,2), new Punto(0,2), new Punto(0, 0)};
        Cuadrado cuadrado = new Cuadrado(puntos);
        JOptionPane.showMessageDialog(null, String.format("%.2f",cuadrado.calcularArea()), "Area de un cuadrado", 1);
        
        {
            Punto[] nuevosPuntos = {new Punto(2, 2), new Punto(4,2), new Punto(6,0), new Punto(0, 0)};
            puntos = nuevosPuntos;
        }

        Trapezoide trapezoide = new Trapezoide(puntos);
        JOptionPane.showMessageDialog(null, String.format("%.2f",trapezoide.calcularArea()), "Area de un trapezoide", 1);

        {
            Punto[] nuevosPuntos = {new Punto(0, 2), new Punto(2,2), new Punto(4,0), new Punto(2, 0)};
            puntos = nuevosPuntos;
        }
        
        Paralelogramo paralelogramo = new Paralelogramo(puntos);
        JOptionPane.showMessageDialog(null, String.format("%.2f",paralelogramo.calcularArea()), "Area de un paralelogramo", 1);

        {
            Punto[] nuevosPuntos = {new Punto(0, 2), new Punto(4,2), new Punto(4,0), new Punto(0, 0)};
            puntos = nuevosPuntos;
        }
        
        Rectangulo rectangulo = new Rectangulo(puntos);
        JOptionPane.showMessageDialog(null, String.format("%.2f",rectangulo.calcularArea()), "Area de un rectangulo", 1);

    }
}