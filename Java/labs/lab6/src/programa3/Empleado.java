package programa3;

public abstract class Empleado {
    private final String primerNombre;
    private final String apellidoPaterno;
    private final String numeroSeguroSocial;
    private final Fecha fechaNacimiento;

    public Empleado(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, Fecha fechaNacimiento) {
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        this.numeroSeguroSocial = numeroSeguroSocial;
        this.fechaNacimiento = fechaNacimiento;
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

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public abstract double ingresos();
    
    @Override
    public String toString() {
        return String.format("%s %s\nNumero de seguro social: %s\n", getPrimerNombre(), getApellidoPaterno(), getNumeroSeguroSocial());
    }
}
