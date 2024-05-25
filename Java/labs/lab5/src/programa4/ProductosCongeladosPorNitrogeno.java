package programa4;

public class ProductosCongeladosPorNitrogeno extends ProductosCongelados{
    String metodoDeCongelacion;
    double tiempoExposicionEnSegundos;

    public ProductosCongeladosPorNitrogeno(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaRecomendada, String metodoDeCongelacion, double tiempoExposicionEnSegundos) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.metodoDeCongelacion = metodoDeCongelacion;
        this.tiempoExposicionEnSegundos = tiempoExposicionEnSegundos;
    }

    public String getMetodoDeCongelacion() {
        return metodoDeCongelacion;
    }

    public void setMetodoDeCongelacion(String metodoDeCongelacion) {
        this.metodoDeCongelacion = metodoDeCongelacion;
    }

    public double getTiempoExposicionEnSegundos() {
        return tiempoExposicionEnSegundos;
    }

    public void setTiempoExposicionEnSegundos(double tiempoExposicionEnSegundos) {
        this.tiempoExposicionEnSegundos = tiempoExposicionEnSegundos;
    }	
}
