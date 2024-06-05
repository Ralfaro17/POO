package prueba;

import javax.swing.JOptionPane; 

public class CalculoFactura {
    public static void main(String[] args) {
        ProductoDescuento producto1 = new ProductoDescuento("Sarten", 1099);
        ProductoImpuesto producto2 = new ProductoImpuesto("Cuchillo", 249);
        double total = 0;

        Producto[] productos = {producto1, producto2};

        for (Producto producto : productos) {
            total += (producto instanceof ProductoDescuento) ? producto.calcularTotal(0.3) : producto.calcularTotal(0.15);
            JOptionPane.showMessageDialog(null, producto);
        }

        JOptionPane.showMessageDialog(null, String.format("Total: %.2f", total));


    }
}
