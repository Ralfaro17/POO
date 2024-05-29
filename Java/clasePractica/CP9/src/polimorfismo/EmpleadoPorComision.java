package polimorfismo;

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
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString() {
        return String.format("empleado por comision: %s %s\nnumero de seguro social: %s\nventas brutas: %.2f\ntarifa de comision: %.2f\n",getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getVentasBrutas(), getTarifaComision());
    }
}