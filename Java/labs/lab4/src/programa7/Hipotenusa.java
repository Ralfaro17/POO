package programa7;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Hipotenusa {
    public static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, String.format("El triangulo 1, con lados de longitud 3 y 4,%ntiene una hipotenusa de longitud %.2f", Hipotenusa.calcularHipotenusa(3,4)), "Datos triangulo 1", 1);
        JOptionPane.showMessageDialog(null, String.format("El triangulo 1, con lados de longitud 5 y 12,%ntiene una hipotenusa de longitud %.2f", Hipotenusa.calcularHipotenusa(5,12)), "Datos triangulo 2", 1);
        JOptionPane.showMessageDialog(null, String.format("El triangulo 1, con lados de longitud 8 y 15,%ntiene una hipotenusa de longitud %.2f", Hipotenusa.calcularHipotenusa(8,15)), "Datos triangulo 3", 1);
    }
}
