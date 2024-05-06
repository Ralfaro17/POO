package programa6;

public class Empleado {
    private String primerNombre;
    private String apellidoPaterno;
    private double salarioMensual;

    public Empleado(String primerNombre, String apellidoPaterno, double salarioMensual){
        this.primerNombre = primerNombre;
        this.apellidoPaterno = apellidoPaterno;
        if (salarioMensual >= 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public double getSalarioMensual() {
        return salarioMensual;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public void setSalarioMensual(double salarioMensual) {
        if (salarioMensual >= 0.0) {
            this.salarioMensual = salarioMensual;
        }
    }
}
