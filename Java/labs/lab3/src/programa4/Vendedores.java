package programa4;

import javax.swing.JOptionPane;

public class Vendedores {
    public static void main(String[] args) {
        int[][] ventas = new int[4][5];
        String printer = String.format("%30s %30s %30s %30s %30s %30s %30s", "Vendedor", "Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5", "");

        

        JOptionPane.showMessageDialog(null, printer, "Totales", 1);
    }
}
