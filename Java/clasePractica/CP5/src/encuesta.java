import javax.swing.JOptionPane;
import java.lang.Math;

public class encuesta {
    public static void main(String[] args) {
        String[] OpcionesSexo = {"Masculino", "Femenino"};
        String[] OpcionesTrabajo = {"Si trabajo", "No trabajo"};
        int[] sexo = new int[10];
        int[] trabajan = new int[10]; 
        double[] sueldo = new double[10];
        String message = "";
        int cantidadHombres = 0, cantidadMujeres = 0, hombresTrabajadores = 0, mujeresTrabajadoras = 0;
        double sueldoTotalHombres = 0, sueldoTotalMujeres = 0;

        for(int i = 0; i < 10; i++){
            sexo[i] = JOptionPane.showOptionDialog(null, String.format("Selecciona tu sexo"), "Input de sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, OpcionesSexo, OpcionesSexo[0]);
            if(sexo[i] == 0){
                cantidadHombres++;
            }
            else{
                cantidadMujeres++;
            }

            trabajan[i] = JOptionPane.showOptionDialog(null, String.format("Selecciona si trabajas o no"), "Input de trabajo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, OpcionesTrabajo, OpcionesTrabajo[0]);

            if (trabajan[i] == 1){
                sueldo[i] = 0;
            }
            else{
                sueldo[i] = (Math.random() * (2000 - 600 + 1)) + 600;
            }

            if (trabajan[i] == 0 && sexo[i] == 0) {
                hombresTrabajadores++;
                sueldoTotalHombres += sueldo[i];
            }
            else if(trabajan[i] == 0 && sexo[i] == 1){
                mujeresTrabajadoras++;
                sueldoTotalMujeres += sueldo[i];
            }
        }

        message += String.format("Cantidad de hombres: %20d%n", cantidadHombres);
        message += String.format("Cantidad de mujeres: %20d%n", cantidadMujeres);
        message += String.format("Cantidad de hombres que trabajan: %20d%n", hombresTrabajadores);
        message += String.format("Cantidad de mujeres que trabajan: %20d%n", mujeresTrabajadoras);

        if(hombresTrabajadores == 0){
            hombresTrabajadores = 1;
        }
        
        if(mujeresTrabajadoras == 0){
            mujeresTrabajadoras = 1;
        }
        
        message += String.format("Sueldo promedio de hombres que trabajan: %20.2f%n", sueldoTotalHombres/hombresTrabajadores);
        message += String.format("Sueldo promedio de mujeres que trabajan: %20.2f%n", sueldoTotalMujeres/mujeresTrabajadoras);

        JOptionPane.showMessageDialog(null, message, "Resultados", 1);

    }
}
