package programa1;

public class EmpleadoAsalariado extends Empleado {
    double salarioSemanal;

    public EmpleadoAsalariado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial,
            double salarioSemanal, Fecha fechaNacimiento) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        this.salarioSemanal = salarioSemanal;
    }

    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    @Override
    public double ingresos() {
        return getSalarioSemanal();
    }

    @Override
    public String toString(){
        return String.format("empleado asalariado: %s %s\nnumero seguro social: %s\nsalario semanal: %.2f\n",getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getSalarioSemanal());    }
}
