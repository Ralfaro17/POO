package programa5;

import javax.swing.JOptionPane;

public class PruebaFecha {
    public static void main(String[] args) {
        Fecha instancia1 = new Fecha(1, 12, 2024);

        JOptionPane.showMessageDialog(null, String.format("Dia: %d%nMes: %d%nAnio: %d%nFecha completa: %s", instancia1.getDia(), instancia1.getMes(), instancia1.getAnio(), instancia1.mostrarFecha()), "Informacion fecha", 1);

        instancia1.setDia(25);
        instancia1.setMes(4);
        instancia1.setAnio(2023);

        JOptionPane.showMessageDialog(null, String.format("Dia: %d%nMes: %d%nAnio: %d%nFecha completa: %s", instancia1.getDia(), instancia1.getMes(), instancia1.getAnio(), instancia1.mostrarFecha()), "Informacion fecha modificada", 1);


    }
}
