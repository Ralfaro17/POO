package programa10;

import javax.swing.JOptionPane;

public class PruebaFactura {
	public static void main(String[] args) {
		
		Factura factura1 = new Factura("A1234", "Sarten", 4, 449.99);
		
		JOptionPane.showMessageDialog(null, String.format("Numero de pieza: %s%nDescripcion de pieza: %s%nCantidad: %d%nPrecio por articulo: %.2f%nMonto de la factura: %.2f%n",
		factura1.getNumDePieza(), factura1.getDescripcionDePieza(), factura1.getCantidad(), factura1.getPrecioArticulo(), factura1.obtenerMontoFactura()), "Factura", 1);
		
	}

}
