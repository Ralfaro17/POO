package practica;

public class Factura {
	
	private String numDePieza;
	private String descripcionDePieza;
	private int Cantidad;
	private double precioArticulo;
	
	public Factura(String numDePieza, String descripcionDePieza, int Cantidad, double precioArticulo) {
		this.numDePieza = numDePieza;
		this.descripcionDePieza = descripcionDePieza;
		
		if (Cantidad > 0) {
		this.Cantidad = Cantidad;
		}else {
			this.Cantidad = 0;	
		}
		
		if (precioArticulo > 0) {
			this.precioArticulo = precioArticulo;
			}else {
				this.precioArticulo = 0;	
			}	
	}

	public String getNumDePieza() {
		return numDePieza;
	}

	public void setNumDePieza(String numDePieza) {
		this.numDePieza = numDePieza;
	}

	public String getDescripcionDePieza() {
		return descripcionDePieza;
	}

	public void setDescripcionDePieza(String descripcionDePieza) {
		this.descripcionDePieza = descripcionDePieza;
	}

	public int getCantidad() {
		return Cantidad;
	}

	public void setCantidad(int Cantidad) {
		if (Cantidad > 0) {
			this.Cantidad = Cantidad;
			}else {
				this.Cantidad = 0;	
			}
	}

	public double getPrecioArticulo() {
		return precioArticulo;
	}

	public void setPrecioArticulo(double precioArticulo) {
		if (precioArticulo > 0) {
			this.precioArticulo = precioArticulo;
			}else {
				this.precioArticulo = 0;	
			}	
	}
	
	public double obtenerMontoFactura() {
		return Cantidad * precioArticulo;
	}
	
	

}
