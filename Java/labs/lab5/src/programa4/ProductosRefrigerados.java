package programa4;

public class ProductosRefrigerados extends Produtos{
    String codigoOrganismoSupervision;
    String fechaEnvasado;
    String temperaturaRecomendada;
    String paisOrigen;

    public ProductosRefrigerados(String fechaCaducidad, String numeroLote, String codigoOrganismoSupervision, String fechaEnvasado, String temperaturaRecomendada, String paisOrigen) {
        super(fechaCaducidad, numeroLote);
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
        this.fechaEnvasado = fechaEnvasado;
        this.temperaturaRecomendada = temperaturaRecomendada;
        this.paisOrigen = paisOrigen;
    }

    public String getCodigoOrganismoSupervision() {
        return codigoOrganismoSupervision;
    }

    public void setCodigoOrganismoSupervision(String codigoOrganismoSupervision) {
        this.codigoOrganismoSupervision = codigoOrganismoSupervision;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }

    public String getTemperaturaRecomendada() {
        return temperaturaRecomendada;
    }

    public void setTemperaturaRecomendada(String temperaturaRecomendada) {
        this.temperaturaRecomendada = temperaturaRecomendada;
    }

    public String getPaisOrigen() {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    
}
