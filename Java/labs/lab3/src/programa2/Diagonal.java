package programa2;

import javax.swing.JOptionPane;

public class Diagonal {
    public static void main(String[] args) {
        int[][] matriz;
        int tamanio;
        int totalDiagonal = 0, totalInvertida = 0; 
        String printer = String.format("Entrada%n");
        int contador = 0;

        tamanio = Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de filas de la matriz"));
        if(Integer.parseInt(JOptionPane.showInputDialog("Escribe la cantidad de columnas de la matriz")) == tamanio){
            matriz = new int[tamanio][tamanio];
        }
        else{
            return;
        }
        contador = tamanio-1;

        for(int i = 0; i < tamanio; i++){
            for(int j = 0; j < tamanio; j++){
                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog(String.format("Escribe el valor de la fila %d y columna %d", i, j)));
                printer += String.format("%d ", matriz[i][j]);
                if(i == j){
                    totalDiagonal += matriz[i][j];
                }
                if(j == contador){
                    contador--;
                    totalInvertida += matriz[i][j];
                }
                if(j == tamanio-1){
                    printer += String.format("%n");
                }
            }
        }

        printer += String.format("Suma diagonal%n%d%n", totalDiagonal);
        printer += String.format("Suma diagonal invertida%n%d%n", totalInvertida);
        printer += String.format("Total del las anteriores%n%d%n", totalDiagonal+totalInvertida);

        JOptionPane.showMessageDialog(null, printer, "Datos", 1);
    }
}
