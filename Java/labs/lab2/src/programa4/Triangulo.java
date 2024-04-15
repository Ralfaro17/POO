package programa4;

import javax.swing.JOptionPane;

public class Triangulo {
    public static void main(String[] args) {
        double lado1 = 0, lado2 = 0, lado3 = 0;
        boolean error = true;
        while(error)
        {
            try {
                lado1 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un numero distinto de 0"));
                if(lado1 != 0){
                    error = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }
        error = true;

        while (error) {
            try {
                lado2 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa otro numero distinto de 0"));
                if (lado2 != 0) {
                    error = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }
        error = true;

        while (error) {
            try {
                lado3 = Double.parseDouble(JOptionPane.showInputDialog("Ingresa un ultimo numero distinto de 0"));
                if(lado3 != 0){
                    error = false;
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }

        if(lado1+lado2 > lado3 && lado1+lado3 > lado2 && lado2+lado3 > lado1){
            JOptionPane.showMessageDialog(null, "Los 3 numeros anteriores conforman los lados de un triangulo", "Resultado", 1);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los 3 numeros anteriores no conforman los lados de un triangulo", "Resultado", 1);
        }
    }
}
