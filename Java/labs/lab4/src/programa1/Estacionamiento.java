package programa1;

import javax.swing.JOptionPane;

public class Estacionamiento {
    public static void main(String[] args){
        float total = 0;
        int clientes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de clientes"));
        for(int i = 0; i < clientes; i++){
            float horasEstacionado = Float.parseFloat(JOptionPane.showInputDialog(String.format("Ingrese las horas estacionado del cliente %d", i + 1)));
            total += calcularCargos(horasEstacionado);
        }
        JOptionPane.showMessageDialog(null, String.format("El total de cargos es: $%.2f", total), "Total de cargos", 1);
    }

    public static float calcularCargos(float horasEstacionado){
        float cargo = 0;
        if(horasEstacionado <= 3){
            cargo = 2;
        }else{
            cargo = 2 + ((int) horasEstacionado - 3) * 0.5f;
        }
        return cargo;
    }
}
