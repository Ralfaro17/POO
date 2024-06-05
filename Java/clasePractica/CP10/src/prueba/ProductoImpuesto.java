package prueba;

public class ProductoImpuesto extends Producto{
    public ProductoImpuesto(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public double calcularTotal(double porcentaje) {
        return getPrecio() * (1 + porcentaje);
    }

    @Override
    public String toString() {
        return String.format("%s\nPrecio con impuesto: %.2f\n", super.toString(), calcularTotal(0.15));
    }
}