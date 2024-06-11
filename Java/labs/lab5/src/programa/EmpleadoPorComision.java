package programa;

public class EmpleadoPorComision extends Empleado{
    private double tarifaComision; 
    private double ventasBrutas;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double tarifaComision, double ventasBrutas) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
        this.tarifaComision = (tarifaComision >= 0) ? tarifaComision : 0.0;
        this.ventasBrutas = (ventasBrutas >= 0) ? ventasBrutas : 0.0;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = (tarifaComision >= 0) ? tarifaComision : 0.0;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = (ventasBrutas >= 0) ? ventasBrutas : 0.0;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Comision: %.2f\nVentas: %.2f\n", getTarifaComision(), getVentasBrutas());
    }
}