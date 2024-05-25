package programa4;

public class ProductosCongelados extends Produtos{
    String fechaEnvasado;
    String paisOrigen;
    String temperaturaRecomendada;

    public ProductosCongelados(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaRecomendada) {
        super(fechaCaducidad, numeroLote);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    
}
