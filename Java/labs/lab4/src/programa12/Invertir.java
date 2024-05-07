package programa12;

import javax.swing.JOptionPane;

public class Invertir {
    public static int invertirNumero(int numero) {
        int invertido = 0;
        while (numero > 0) {
            invertido = invertido * 10 + numero % 10;
            numero /= 10;
            
        }
        return invertido;
    }   

    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        JOptionPane.showMessageDialog(null, "El número invertido es: " + invertirNumero(numero));
    }
}
