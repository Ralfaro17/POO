package polimorfismo;

import javax.swing.JOptionPane;

public class PruebaNominaEmpleados {
    public static void main(String[] args) {
        // Crear objetos de todas las clases
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", "Perez", "777", 200);
        EmpleadoPorComision empleado2 = new EmpleadoPorComision("Jose", "Sanchez", "1234", 20, 40);
        EmpleadoBaseMasComision empleado3 = new EmpleadoBaseMasComision("Jimmy", "Moncada", "5678", 20, 10, 600);
        EmpleadoPorHora empleado4 = new EmpleadoPorHora("William", "Martinez", "09876", 42, 40);

        // Crear un arreglo empleado inicializado con los objetos de las subclases
        Empleado[] empleados = {empleado1, empleado2, empleado3, empleado4};

        String salida = String.format("Empleados procesados de forma polimorfica: %n%n");

        for(Empleado empleadoActual:empleados){
            salida += empleadoActual;
            salida += String.format("ingresos $%.2f%n%n", empleadoActual.ingresos());
            JOptionPane.showMessageDialog(null, salida);
        }

    }
}
