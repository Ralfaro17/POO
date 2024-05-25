package programa4;

public class ProductosCongeladosPorAgua extends ProductosCongelados{
    double gramosDeSalPorLitroDeAgua;

    public ProductosCongeladosPorAgua(String fechaCaducidad, String numeroLote, String fechaEnvasado, String paisOrigen, String temperaturaRecomendada, double gramosDeSalPorLitroDeAgua) {
        super(fechaCaducidad, numeroLote, fechaEnvasado, paisOrigen, temperaturaRecomendada);
        this.gramosDeSalPorLitroDeAgua = gramosDeSalPorLitroDeAgua;
    }

    public double getGramosDeSalPorLitroDeAgua() {
        return gramosDeSalPorLitroDeAgua;
    }

    public void setGramosDeSalPorLitroDeAgua(double gramosDeSalPorLitroDeAgua) {
        this.gramosDeSalPorLitroDeAgua = gramosDeSalPorLitroDeAgua;
    }
}
