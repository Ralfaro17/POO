package programa3;

public class EmpleadoPorHora extends Empleado{
    private double horas;
    private double sueldo;

    public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double horas,
            double sueldo, Fecha fechaNacimiento) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, fechaNacimiento);
        this.horas = (horas >= 0 && horas <= 168) ? horas : 0.0;
        this.sueldo = (sueldo >= 0) ? sueldo : 0.0;
    }

    public double getHoras() {
        return horas;
    }

    public void setHoras(double horas) {
        this.horas = (horas >= 0 && horas <= 168) ? horas : 0.0;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = (sueldo >= 0) ? sueldo : 0.0;
    }

    public double ingresos(){
        double horasTrabajadas = getHoras();
        if (horasTrabajadas <= 40){
            return getSueldo() * horasTrabajadas;
        }
        else if(horasTrabajadas > 40){
            return 40 * getSueldo() + (horas - 40) * getSueldo() * 1.5;
        }
        else{
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.format("empleado por hora: %s %s\nnumero de seguro social: %s\nsueldo por horas: %.2f; horas trabajadas: %.2f\n",getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial(), getSueldo(), getHoras());
    }


}