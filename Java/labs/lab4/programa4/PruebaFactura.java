package programa4;

public class PruebaFactura {
	public static void main(String[] args) {
		
		Factura factura1 = new Factura("A1234", "Sarten", 4, 449.99);
		
		System.out.println("Numero de pieza: " + factura1.getNumDePieza());
		System.out.println("Descripcion de pieza: " + factura1.getDescripcionDePieza());
		System.out.println("Cantidad: " + factura1.getCantidad());
		System.out.println("Precio por articulo: " + factura1.getPrecioArticulo());
		System.out.println("Monto de la factura: " + factura1.obtenerMontoFactura());
		
	}

}
