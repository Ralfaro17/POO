package programa9;

import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float numero1 = 0, numero2 = 0;
        boolean error = true;

        do {
            System.out.println("Escribe el numero 1:");
            if(entrada.hasNextFloat()){
                numero1 = entrada.nextFloat();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        do {
            System.out.println("Escribe el numero 2:");
            if(entrada.hasNextFloat()){
                numero2 = entrada.nextFloat();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        float division = numero1/numero2;
        if (division.isInfinite()) {
            System.out.printf("la division de %.2f y %.2f es %.2f", numero1, numero2, division);
        }
            

            System.out.println("Error: ha ocurrido una division entre 0");


        entrada.close();
    }
}
