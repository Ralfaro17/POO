package programa9;

import javax.swing.JOptionPane;

public class Par {
    public static boolean esPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce un número"));

            if (Par.esPar(numero)) {
                JOptionPane.showMessageDialog(null, String.format("%d es par", numero), "Par", 1);
            }
            else {
                JOptionPane.showMessageDialog(null, String.format("%d no es par", numero), "Par", 1);
            }

            int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?", "Par", JOptionPane.YES_NO_OPTION);

            if (respuesta == 1) {
                continuar = false;
            }
        }
    }
}
