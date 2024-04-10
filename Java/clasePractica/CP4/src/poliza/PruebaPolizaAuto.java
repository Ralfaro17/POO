package poliza;

import javax.swing.JOptionPane;

public class PruebaPolizaAuto {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null, "waos");
        PolizaAuto instancia1 = new PolizaAuto(1234, "Toyota corolla", "MY");
        
        JOptionPane.showMessageDialog(null, String.format("Tu numero de cuenta es: %d%nTu marca y modelo son: %s%nTu municipio es: %s%nTu municipio no tiene multa? %b%n", instancia1.getNumeroCuenta(), instancia1.getMarcoYModelo(), instancia1.getMunicipio(), instancia1.municipioSinMulta() ), "Datos objeto 1 mediante constructor", 1);

        instancia1.setNumeroCuenta(Integer.parseInt(JOptionPane.showInputDialog("Escribe tu numero de cuenta:")));
        instancia1.setMarcoYModelo( JOptionPane.showInputDialog("Escribe tu marca y modelo:"));
        instancia1.setMunicipio( JOptionPane.showInputDialog("Escribe tu municipio:"));

        JOptionPane.showMessageDialog(null, String.format("Tu numero de cuenta es: %d%nTu marca y modelo son: %s%nTu municipio es: %s%nTu municipio no tiene multa? %b%n", instancia1.getNumeroCuenta(), instancia1.getMarcoYModelo(), instancia1.getMunicipio(), instancia1.municipioSinMulta() ), "Datos objeto 1 cambiados por setters y JOptionPane", 1);

    }
}
