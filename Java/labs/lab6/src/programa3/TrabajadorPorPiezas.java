package programa3;

import programa.Empleado;

public class TrabajadorPorPiezas extends Empleado{
    private double sueldo;
    private int piezas;
    
    public TrabajadorPorPiezas(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            Fecha fechaNacimiento, double sueldo, int piezas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        this.sueldo = sueldo;
        this.piezas = piezas;
    }

    public int getPiezas() {
        return piezas;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public double ingresos() {
        return getSueldo() * getPiezas();
    }

    @Override
    public String toString() {
        return String.format("trabajador por piezas: %s %s\nnumero de seguro social: %s\nsueldo por pieza: %.2f; piezas trabajadas: %d\n",getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getSueldo(), getPiezas());
    }
}
