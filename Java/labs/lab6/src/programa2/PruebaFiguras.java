package programa2;

import javax.swing.JOptionPane;

public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        Cuadrado cuadrado = new Cuadrado(2);
        Esfera esfera = new Esfera(5);
        Cubo cubo = new Cubo(4);
        Tetraedro tetraedro = new Tetraedro(5);
        Triangulo triangulo = new Triangulo(5, 5);
    
        Figura figuras[] = {circulo, cuadrado, esfera, cubo, tetraedro, triangulo};
    
        for(Figura figura : figuras){
            String mensaje = figura.getClass().getName().replaceFirst("programa2.", "") + "\n";
            if(figura instanceof FiguraBidimensional){
                mensaje += "Figura bidimensional\n";
                mensaje += "Area: " + figura.obtenerArea() + "\n";
            }
            else{
                mensaje += "Figura tridimensional\n";
                mensaje += "Area: " + figura.obtenerArea() + "\n";
                mensaje += "Volumen: " + figura.obtenerVolumen() + "\n";
            }
            JOptionPane.showMessageDialog(null, mensaje, "Informacion de la figura", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
