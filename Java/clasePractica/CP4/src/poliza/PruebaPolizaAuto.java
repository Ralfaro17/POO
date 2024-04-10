package poliza;

import javax.swing.JOptionPane;

public class PruebaPolizaAuto {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "waos");
        PolizaAuto instacia1 = new PolizaAuto(1234, "Toyota corolla", "MY");
        
        JOptionPane.showMessageDialog(null, instacia1.municipioSinMulta(), "Tus municipio", 1);
        
        
    }
}
