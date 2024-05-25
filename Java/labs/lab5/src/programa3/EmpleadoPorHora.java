package programa3;

public class EmpleadoPorHora extends Empleado{
    private double horas;
    private double sueldo;

    public EmpleadoPorHora(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double horas,
            double sueldo) {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial);
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
        return horas * sueldo;
    }

    @Override
    public String toString() {
        return super.toString() + "Horas: " + horas + "\nSueldo: " + sueldo +"\nIngresos: " + ingresos() + "\n";
    }


}