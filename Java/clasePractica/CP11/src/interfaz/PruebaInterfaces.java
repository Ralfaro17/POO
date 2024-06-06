package interfaz;

import javax.swing.JOptionPane;

public class PruebaInterfaces {
    public static void main(String[] args) {

        PorPagar[] objetosPorPagar = new PorPagar[4];

        objetosPorPagar[0] = new Factura("1234", "Tabla de picar", 1, 375.00);
        objetosPorPagar[1] = new Factura("9876", "piedra de afilar", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("Francisco", "Perez", "001-171201-082G", 750.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Pedro", "Orozco", "123-456789-012A", 1800.00);

        StringBuilder mensaje = new StringBuilder();

        for (PorPagar porPagar : objetosPorPagar) {
            mensaje.append(porPagar.toString()).append("\n\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Factura de Productos y Empleados",
                JOptionPane.INFORMATION_MESSAGE);

    }

}
