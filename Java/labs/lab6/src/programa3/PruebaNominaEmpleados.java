package programa3;

import javax.swing.JOptionPane;

public class PruebaNominaEmpleados {
    public static void main(String[] args) {
        // Crear objetos de todas las clases
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", "Perez", "777", 200, new Fecha(4, 17, 2008));
        //  este empleado recibirá el bono al haber nacido en el mes de mayo, mes en que fue realizado este programa
        EmpleadoPorComision empleado2 = new EmpleadoPorComision("Jose", "Sanchez", "1234", 20, 40, new Fecha(5, 2, 2006));
        EmpleadoBaseMasComision empleado3 = new EmpleadoBaseMasComision("Jimmy", "Moncada", "5678", 20, 10, 600, new Fecha(9, 10, 2001));
        EmpleadoPorHora empleado4 = new EmpleadoPorHora("William", "Martinez", "09876", 42, 40, new Fecha(12, 21, 1978));
        TrabajadorPorPiezas empleado5 = new TrabajadorPorPiezas("Fernando", "Vargas", "08436", new Fecha(11, 30, 1964), 5, 30);

        // Crear un arreglo empleado inicializado con los objetos de las subclases
        Empleado[] empleados = {empleado1, empleado2, empleado3, empleado4, empleado5};

        String salida = String.format("Empleados procesados de forma polimorfica: %n%n");

        for(Empleado empleadoActual:empleados){
            boolean bono = false;
            if(empleadoActual.getFechaNacimiento().getMes() == 5){
                bono = true;
            }
            salida += empleadoActual;
            salida += (bono) ? String.format("ingresos $%.2f%n%n", empleadoActual.ingresos() + 100) : String.format("ingresos $%.2f%n%n", empleadoActual.ingresos());
            JOptionPane.showMessageDialog(null, salida);
        }

    }
}
