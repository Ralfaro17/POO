package programa3;

import javax.swing.JOptionPane;

public class Multiplo {
    public static void main(String[] args) {
        int numero1 = 0, numero2 = 0;
        boolean error = true;
        while(error)
        {
            try {
                numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa un numero"));
                error = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }
        error = true;

        while (error) {
            try {
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingresa otro numero"));
                error = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }

        if(numero2 % numero1 == 0){
            JOptionPane.showMessageDialog(null, String.format("%d es multiplo de %d", numero1, numero2), null, 1);
        }
        else{
            JOptionPane.showMessageDialog(null, String.format("%d no es multiplo de %d", numero1, numero2), null, 1);
        }
    }
}
