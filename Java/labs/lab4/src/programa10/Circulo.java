package programa10;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Circulo {
    public static double circuloArea(double radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo: "));
        JOptionPane.showMessageDialog(null, "El área del círculo es: " + circuloArea(radio));
    }
}
