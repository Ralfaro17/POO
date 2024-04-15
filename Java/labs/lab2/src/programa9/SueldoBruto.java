package programa9;

import java.util.Scanner;

public class SueldoBruto {
    public static void main(String[] args) {
        boolean error = true;
        Scanner entrada = new Scanner(System.in);
        int[] horasTrabajadas = new int[3];
        double[] tarifaPorHora = new double[3], sueldoEnBruto = new double[3];

        for(int i = 0; i < 3; i++){
            do {
                System.out.printf("Ingresa las horas trabajadas por el empleado %d:%n", i+1);
                if(entrada.hasNextInt()){
                    horasTrabajadas[i] = entrada.nextInt();
                    error = false;
                }
                else{
                    entrada.nextLine();
                    System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
                }
            } while (error);
            entrada.nextLine();
            error = true;

            do {
                System.out.printf("Ingresa la tarifa por hora para el empleado %d:%n", i+1);
                if(entrada.hasNextDouble()){
                    tarifaPorHora[i] = entrada.nextDouble();
                    error = false;
                }
                else{
                    entrada.nextLine();
                    System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
                }
            } while (error);
            entrada.nextLine();
            error = true;

            if(horasTrabajadas[i] <= 40){
                sueldoEnBruto[i] = horasTrabajadas[i] * tarifaPorHora[i];
            }
            else{
                sueldoEnBruto[i] = (40 * tarifaPorHora[i]) + ((horasTrabajadas[i] - 40)*(tarifaPorHora[i] * 1.5)); 
            }
        }

        for(int i = 0; i < 3; i++){
            System.out.printf("El sueldo en bruto del trabajador %d es %.2f%n", i+1, sueldoEnBruto[i]);
        }

        entrada.close();
    }
}
