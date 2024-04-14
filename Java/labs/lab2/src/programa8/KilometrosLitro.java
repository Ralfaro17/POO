package programa8;

import javax.swing.JOptionPane;

public class KilometrosLitro {
    public static void main(String[] args) {
        int kilometrosConducidos = 0, litrosPorViaje = 0;
        float totalKilometrosPorLitro = 0;
        boolean error = true;
        
        while (true) {
            while(error)
            {
                try {
                    kilometrosConducidos = Integer.parseInt(JOptionPane.showInputDialog("Ingresa la cantidad de kilometros conducidos en este viaje"));
                    error = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
                }
            }
            error = true;
    
            while (error) {
                try {
                    litrosPorViaje = Integer.parseInt(JOptionPane.showInputDialog("Ingresa los litros usados en este viaje"));
                    error = false;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "No has ingresado un valor valido", "Error", 0);
                }
            }
            error = true;

            totalKilometrosPorLitro += (float) kilometrosConducidos/litrosPorViaje;
            JOptionPane.showMessageDialog(null, String.format("Kilometros por litro en el viaje actual: %.2f%nTotal de kilometros por litro hasta este punto: %.2f%n", (float) kilometrosConducidos/litrosPorViaje, totalKilometrosPorLitro), "Datos de consumo", 1);

            if(JOptionPane.showConfirmDialog(null, "Deseas continuar?", "Pregunta", JOptionPane.YES_NO_OPTION) == 1){
                break;
            }
        }
    }
}
