package programa8;

import javax.swing.JOptionPane;

public class Multiplo {
    public static boolean esMultiplo(int numero1, int numero2) {
        if (numero2 % numero1 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int numero1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el primer número"));
            int numero2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce el segundo número"));

            if (Multiplo.esMultiplo(numero1, numero2)) {
                JOptionPane.showMessageDialog(null, String.format("%d es múltiplo de %d", numero2, numero1), "Multiplo", 1);
            }
            else {
                JOptionPane.showMessageDialog(null, String.format("%d no es múltiplo de %d", numero2, numero1), "Multiplo", 1);
            }

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Multiplo", JOptionPane.YES_NO_OPTION);

            if (respuesta == 1) {
                continuar = false;
            }
        }
    }
}
