package programa1;

import javax.swing.JOptionPane;

public class Calculadora {
    public static void main(String[] args) {
        double numero1 = 0, numero2 = 0;
        boolean error = true;
        while(error)
        {
            try {
                numero1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero"));
                error = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }
        error = true;

        while (error) {
            try {
                numero2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa otro numero"));
                error = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }

        JOptionPane.showMessageDialog(null, String.format("Suma: %.2f%nResta: %.2f%nMultiplicacion: %.2f%nDivision: %.2f%n", numero1+numero2, numero1-numero2, numero1*numero2, numero1/numero2), "Resultado", 1);
    }
}
