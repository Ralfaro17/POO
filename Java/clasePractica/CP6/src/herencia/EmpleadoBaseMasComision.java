package herencia;

import javax.swing.JOptionPane;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    private double salarioBase;

    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double tarifaComision, double ventasBrutas, double salarioBase){
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, tarifaComision, ventasBrutas);
        this.salarioBase = (salarioBase >= 0) ? salarioBase : 0;
    }
    
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = (salarioBase >= 0) ? salarioBase : 0;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double salario(){
        return super.salario() + getSalarioBase(); 
    }

    @Override
    public String toString() {
        return super.toString() + String.format("Salario Base: %.2f%n", getSalarioBase());
    }

    public static void main(String[] args) {
        EmpleadoBaseMasComision empleado1 = new EmpleadoBaseMasComision("Roger", "Alfaro", "12345678", 20, 5, 200);
        JOptionPane.showMessageDialog(null, empleado1, "Datos empleado 1", 1);
    }
}
