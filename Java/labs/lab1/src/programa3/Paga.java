package programa3;

import java.util.Scanner;

public class Paga {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int horasTrabajadas = 0;
        float costeHora = 0;
        boolean error = true;

        do {
            System.out.println("Escribe las horas trabajadas:");
            if(entrada.hasNextInt()){
                horasTrabajadas = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un dato valido");
            }
        } while (error);
        entrada.nextLine();
        error = true;

        do {
            System.out.println("Escribe el coste por hora trabajada:");
            if(entrada.hasNextFloat()){
                costeHora = entrada.nextFloat();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un dato valido");
            }
        } while (error);
        entrada.nextLine();
        error = true;

        System.out.printf("La paga por %d horas trabajadas a %.2f por hora es de: %.2f", horasTrabajadas, costeHora, horasTrabajadas*costeHora);

        entrada.close();
    }
}
