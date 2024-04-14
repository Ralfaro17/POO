package programa2;

import javax.swing.JOptionPane;

public class MasGrande {
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

        if(numero1 > numero2){
            JOptionPane.showMessageDialog(null, String.format("%d es mas grande que %d", numero1, numero2 ), null, 1);
        }
        else if(numero2 > numero1){
            JOptionPane.showMessageDialog(null, String.format("%d es mas grande que %d", numero2, numero1), null, 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Ambos numeros son iguales", null, 1);
        }
        
    }
}
