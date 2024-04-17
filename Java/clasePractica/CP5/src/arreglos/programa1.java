package arreglos;

import javax.swing.JOptionPane;

public class programa1 {
    public static void main(String[] args){
        int[] pares = new int[10];
        String mensaje = String.format("%8s%8s%n", "Indice", "Valor");

        for(int i = 1; i < 21; i++){
            if(i % 2 == 0){
                pares[(i/2)-1] = i; 
                mensaje += String.format("%8d%8d%n", (i/2)-1, pares[(i/2)-1]);
            }
        }

        JOptionPane.showMessageDialog(null, mensaje, "Pares del 0 al 20", 1);
    }
}
