package prueba;

public abstract class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // el parámetro porcentaje debe ser una representación decimal de un porcentaje
    public abstract double calcularTotal(double porcentaje);

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nPrecio: %.2f\n", getNombre(), getPrecio());
    }
}
