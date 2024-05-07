package programa3;

import javax.swing.JOptionPane;

public class Salario{
    private int horasTrabajadas;
    private float sueldoHora;

    public Salario(int horasTrabajadas, float sueldoHora){
        if (horasTrabajadas < 0) {
            this.horasTrabajadas = 0;
        }
        else{
            this.horasTrabajadas = horasTrabajadas;
        }
        if(sueldoHora >= 0){
            this.sueldoHora = sueldoHora;
        }
        else{
            this.sueldoHora = 5;
        }
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public float getSueldoHora() {
        return sueldoHora;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        if (horasTrabajadas < 0) {
            this.horasTrabajadas = 0;
        }
        else{
            this.horasTrabajadas = horasTrabajadas;
        }
    }

    public void setSueldoHora(float sueldoHora) {
        if(sueldoHora >= 0){
            this.sueldoHora = sueldoHora;
        }
        else{
            this.sueldoHora = 5;
        }
    }

    public float calcularSalario(){
        return getHorasTrabajadas() * getSueldoHora();
    }

    public float calcularImpuestos(){
        return calcularSalario() * 0.247f;
    }

    public float calcularNeto(){
        return calcularSalario() - calcularImpuestos();
    }


    public static void main(String[] args){
        int cantidadTrabajadores = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de trabajadores"));
        for(int i = 0; i < cantidadTrabajadores; i++){
            Salario salario = new Salario(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las horas trabajadas")), Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldo por hora")));
            JOptionPane.showMessageDialog(null, String.format("El salario es: %.2f\nEl impuesto es: %.2f\nEl salario neto es: %.2f", salario.calcularSalario(), salario.calcularImpuestos(), salario.calcularNeto()), "Salario", 1);
        }
        
    }
}