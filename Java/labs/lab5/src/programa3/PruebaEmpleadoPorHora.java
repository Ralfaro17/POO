package programa3;

import javax.swing.JOptionPane;

public class PruebaEmpleadoPorHora {
    public static void main(String[] args) {
        EmpleadoPorHora empleado1 = new EmpleadoPorHora("Jose", "Fonseca", "12345678", 40, 20);
    
        JOptionPane.showMessageDialog(null, empleado1, "Datos empleado", 1);
        
    }
}
