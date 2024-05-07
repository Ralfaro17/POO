package programa11;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Minimo {
    public static double minimo3(double a, double b, double c) {
        return Math.min(a, Math.min(b, c));
    }

    public static void main(String[] args) {
        double[] arreglo = new double[3];
        
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Ingresa el valor del numero %d: ", i + 1)));
        }

        JOptionPane.showMessageDialog(null, String.format("El numero menor de todos los anteriores es: %.2f", Minimo.minimo3(arreglo[0], arreglo[1], arreglo[2])), null, 0);
    }


}
