package poliza;

public class PolizaAuto {
    // atributos
    private int numeroCuenta;
    private String marcoYModelo;
    private String municipio;

    // constructor
    public PolizaAuto(int numeroCuenta, String marcoYModelo, String municipio){
        this.numeroCuenta = numeroCuenta;
        this.marcoYModelo = marcoYModelo;
        this.municipio = municipio;
    }

    // getters
    public String getMarcoYModelo() {
        return marcoYModelo;
    }

    public String getMunicipio() {
        return municipio;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    // setters
    public void setMarcoYModelo(String marcoYModelo) {
        this.marcoYModelo = marcoYModelo;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public boolean municipioSinMulta(){
        boolean municipioSinMulta;
        switch (getMunicipio()) {
            case "MY": case "GR": case "LE": case "MT":
                municipioSinMulta = true;
                break;
            default:
                municipioSinMulta = false;
                break;
        }
        return municipioSinMulta;
    }

}