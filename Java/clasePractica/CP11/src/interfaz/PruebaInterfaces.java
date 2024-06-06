package interfaz;

import javax.swing.JOptionPane;

public class PruebaInterfaces {
    public static void main(String[] args) {

        PorPagar[] objetosPorPagar = new PorPagar[4];

        objetosPorPagar[0] = new Factura("01234", "asiento", 2, 375.00);
        objetosPorPagar[1] = new Factura("56789", "llanta", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("Juan", "Perez", "111-11-1111", 800.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Pedro", "Gomez", "222-22-2222", 1200.00);

        StringBuilder mensaje = new StringBuilder();

        for (PorPagar porPagar : objetosPorPagar) {
            mensaje.append(porPagar.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Factura de Productos y Empleados",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
