package interfaz;

import javax.swing.JOptionPane;

public class PruebaInterfaces {
    public static void main(String[] args) {

        PorPagar[] objetosPorPagar = new PorPagar[4];

        objetosPorPagar[0] = new Factura("1234", "Tabla de picar", 1, 375.00);
        objetosPorPagar[1] = new Factura("9876", "piedra de afilar", 4, 79.95);
        objetosPorPagar[2] = new EmpleadoAsalariado("Francisco", "Perez", "001-171201-082G", 750.00);
        objetosPorPagar[3] = new EmpleadoAsalariado("Pedro", "Orozco", "123-456789-012A", 1800.00);

        String mensaje = "Facturas y Empleados por pagar\n\n";

        for (PorPagar objeto : objetosPorPagar) {
            mensaje += objeto + "\n";
        }

        JOptionPane.showMessageDialog(null, mensaje, "Prueba de interfaces Polimorficas", 1);

    }

}
