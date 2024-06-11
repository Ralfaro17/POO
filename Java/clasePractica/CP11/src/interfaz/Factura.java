package interfaz;

public class Factura implements PorPagar {
    private final String numeroPieza;
    private final String descripcionPieza;
    private int cantidad;
    private double precioPorArticulo;

    public Factura(String numeroPieza, String descripcionPieza, int cantidad, double precioPorArticulo) {
        this.numeroPieza = numeroPieza;
        this.descripcionPieza = descripcionPieza;
        this.cantidad = cantidad;
        this.precioPorArticulo = precioPorArticulo;
    }

    public String getNumeroPieza() {
        return numeroPieza;
    }

    public String getDescripcionPieza() {
        return descripcionPieza;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioPorArticulo() {
        return precioPorArticulo;
    }

    public void setPrecioPorArticulo(double precioPorArticulo) {
        this.precioPorArticulo = precioPorArticulo;
    }

    @Override
    public double obtenerMontoPago() {
        return getCantidad() * getPrecioPorArticulo();
    }

    @Override
    public String toString() {
        return String.format(
                "numero de pieza: %s\ndescripcion: %s\ncantidad: %d\nprecio por articulo: %.2f%n",
                getNumeroPieza(), getDescripcionPieza(), getCantidad(), getPrecioPorArticulo());
    }

}
