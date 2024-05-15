package herencia;

import javax.swing.JOptionPane;

public class EmpleadoPorComision {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private double tarifaComision;
    private double ventasBrutas;

    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double tarifaComision, double ventasBrutas){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.tarifaComision = (tarifaComision >= 0) ? tarifaComision : 0;
        this.ventasBrutas = (ventasBrutas >= 0) ? ventasBrutas : 0;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getNumeroSeguroSocial() {
        return numeroSeguroSocial;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public double getVentasBrutas() {
        return ventasBrutas;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = (tarifaComision >= 0) ? tarifaComision : 0;
    }

    public void setVentasBrutas(double ventasBrutas) {
        this.ventasBrutas = (ventasBrutas >= 0) ? ventasBrutas : 0;
    }

    public double salario(){
        return getTarifaComision() * getVentasBrutas();
    }

    @Override
    public String toString(){
        return String.format("%s %s%nSeguro: %s%nComision: %.2f%nVentas: %.2f%nSalario: %.2f%n", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getTarifaComision(), getVentasBrutas(), salario());
    }

    public static void main(String[] args) {
        EmpleadoPorComision empleado1 = new EmpleadoPorComision("Roger", "Alfaro", "12345678", 20, 5);
        JOptionPane.showMessageDialog(null, empleado1, "Datos empleado 1", 1);
    }
}
