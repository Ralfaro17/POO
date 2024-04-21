package programa4;

import javax.swing.JOptionPane;
import java.lang.Math;

public class Vendedores {
    public static void main(String[] args) {
        double[][] ventas = new double[4][5];
        double totalFila = 0;
        String printer = String.format("%30s %27s %27s %27s %27s %27s %27s %30s%n%n", "Vendedor", "Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5", "Total", "");

        for(int i = 0; i < ventas.length; i++){
            totalFila = 0;
            printer += String.format("%22sVendedor %d", "", i+1);
            for(int j = 0; j < ventas[0].length; j++){
                ventas[i][j] = (Math.random() * (10000 - 100 + 1)) + 100;
                printer += String.format("%30.2f", ventas[i][j]);
                totalFila += ventas[i][j];
                if(j == (ventas[0].length)-1){
                    printer += String.format("%32.2f%n%n", totalFila);
                }
            }
        }

        JOptionPane.showMessageDialog(null, printer, "Tabla de datos", 1);
    }
}
