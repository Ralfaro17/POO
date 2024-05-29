package polimorfismo;

public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    public double salarioBase;
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double tarifaComision, double ventasBrutas, double salarioBase) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, tarifaComision, ventasBrutas);
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    @Override
    public double ingresos(){
        return super.ingresos() + getSalarioBase();
    }

    @Override
    public String toString(){
        return String.format("empleado por comision con salario base: %s %s\nnumero de seguro social: %s\nventas brutas: %.2f\ntarifa de comision: %.2f\nsalario base: %.2f\n",getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getVentasBrutas(), getTarifaComision(), getSalarioBase());
    }
}
