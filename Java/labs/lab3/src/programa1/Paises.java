package programa1;

import javax.swing.JOptionPane;

public class Paises {
    public static void main(String[] args) {
        String[][] paises = new String[3][4];
        String printer = String.format("%20s%30s%n", "Pais", "Ciudades");

        for(int i = 0; i < paises.length; i++){
            paises[i][0] = JOptionPane.showInputDialog(String.format("Escribe el pais numero %d", i+1));
            printer += String.format("%20s%15s", paises[i][0],"");
            for(int j = 0; j < paises[0].length; j++){
                if(j != 0){
                    paises[i][j] = JOptionPane.showInputDialog(String.format("Escribe la ciudad %d del pais %s", j, paises[i][0]));
                    printer += String.format("%s ", paises[i][j]); 
                }
            }
            printer += String.format("%n");
        }

        JOptionPane.showMessageDialog(null, printer, "Datos", 1);
    }
}
