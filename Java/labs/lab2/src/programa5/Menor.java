package programa5;

import javax.swing.JOptionPane;

public class Menor {
    public static void main(String[] args) {
        int tamanio = 0;
        int[] numeros;
        boolean error = true;
        while(error)
        {
            try {
                tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de numeros a evaluar"));
                error = false;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
            }
        }
        error = true;
        numeros = new int[tamanio];

        for(int i = 0; i < tamanio; i++){
            while (error) {
                try {
                    numeros[i] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Ingresa el numero %d", i+1)));
                    error = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
                }
            }
            error = true;
        }
        int menor = numeros[0];

        for(int i = 0; i < tamanio; i++){
            if(numeros[i] < menor){
                menor = numeros[i];
            }
        }

        JOptionPane.showMessageDialog(null, String.format("El numero menor de todos los ingresado anteriormente es %d%n", menor), "Menor", 1);
    }
}
