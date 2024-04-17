package arreglos;

import javax.swing.JOptionPane;

public class programa2 {
    public static void main(String[] args) {
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de valores a evaluar"));
        double[] arreglo = new double[tamanio];
        double total = 0;

        for(int i = 0; i < arreglo.length; i++){
            arreglo[i] = Double.parseDouble(JOptionPane.showInputDialog(String.format("Escribe el valor numero %d:", i+1)));
            total += arreglo[i];
        }

        JOptionPane.showMessageDialog(null, String.format("el promedio de los %d numeros ingresados anteriormente es:%n%.2f", arreglo.length, total/arreglo.length), "Promedio", 1);
    }
}
