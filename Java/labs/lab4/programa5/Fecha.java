package programa5;

public class Fecha {
    int mes;
    int dia;
	int anio;

    public Fecha(int mes, int dia, int anio){
        this.mes = mes;
        this.dia = dia;
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }
    
    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String mostrarFecha(){
        return String.format("%d / %d / %d", getDia(), getMes(), getAnio());
    }
}
