package cuenta;
public class CuentaSaldo {
    private String nombre;
    private double saldo;

    public CuentaSaldo(String nombre, double saldo){
        this.nombre = nombre;
        if(saldo < 0.0){
            System.out.println("El saldo no puede ser menor a 0");
            this.saldo = 0;
        }
        else{
            this.saldo = saldo;
        }
    }

    public void actualizarSaldo(double saldo){
        if(saldo < 0.0){
            System.out.println("El saldo no puede ser menor a 0");
            saldo = 0;
        }
        this.saldo += saldo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNombre(){
        return nombre;
    }
}
