package programa6;

import javax.swing.JOptionPane;

public class PruebaEmpleado {
    public static void main(String[] args) {
        
        Empleado empleado1 = new Empleado("Juan", "Pérez", 5000);
        Empleado empleado2 = new Empleado("Ana", "López", 6000);
    
        JOptionPane.showMessageDialog(null, String.format("El empleado %s %s tiene un salario anual de %.2f", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioMensual() * 12), "Datos empleado 1", 1);
        JOptionPane.showMessageDialog(null, String.format("El empleado %s %s tiene un salario anual de %.2f", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioMensual() * 12), "Datos empleado 2", 1);

        empleado1.setSalarioMensual(empleado1.getSalarioMensual() * 1.1);
        empleado2.setSalarioMensual(empleado2.getSalarioMensual() * 1.1);

        JOptionPane.showMessageDialog(null, String.format("El empleado %s %s ahora tiene un salario anual de %.2f", empleado1.getPrimerNombre(), empleado1.getApellidoPaterno(), empleado1.getSalarioMensual() * 12), "Datos empleado 1 con aumento", 1);
        JOptionPane.showMessageDialog(null, String.format("El empleado %s %s ahora tiene un salario anual de %.2f", empleado2.getPrimerNombre(), empleado2.getApellidoPaterno(), empleado2.getSalarioMensual() * 12), "Datos empleado 2 con aumento", 1);
    }
}
