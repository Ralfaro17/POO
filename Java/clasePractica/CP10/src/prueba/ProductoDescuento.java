package prueba;

public class ProductoDescuento extends Producto{
    public ProductoDescuento(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularTotal(double porcentaje) {
        return getPrecio() * (1 - porcentaje);
    }

    @Override
    public String toString() {
        return String.format("%s\nPrecio con descuento: %.2f\n", super.toString(), calcularTotal(0.3));
    }
}
