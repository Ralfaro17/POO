package programa2;

import javax.swing.JOptionPane;

public class Conversion {
    private double grados;

    public Conversion(double grados) {
        this.grados = grados;
    }

    public double getGrados() {
        return grados;
    }

    public void setGrados(double grados) {
        this.grados = grados;
    }

    public void convertirFC(){
        this.grados = (grados - 32) * 5/9;
    }
    
    public void convertirCF(){
        this.grados = (grados * 9/5) + 32;
    }
    public static void main(String[] args) {
        Conversion conversion1 = new Conversion(Double.parseDouble(JOptionPane.showInputDialog("Ingrese los grados en Celsius")));
        conversion1.convertirCF();
        JOptionPane.showMessageDialog(null, String.format("Los grados en Fahrenheit son: %.2f", conversion1.getGrados()), "Grados en Fahrenheit", 1);
        conversion1.convertirFC();
        JOptionPane.showMessageDialog(null, String.format("Los grados en Celsius son: %.2f", conversion1.getGrados()), "Grados en Celsius", 1);
    }
}
