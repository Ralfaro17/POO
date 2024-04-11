package programa11;

import java.util.Scanner;

public class impuesto{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int edad = 0;
        float ingreso = 0;
        boolean error = true;

        do {
            System.out.println("Ingresa tu edad:");
            if(entrada.hasNextInt()){
                edad = entrada.nextInt();
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
            System.out.println("Escribe tus ingresos mensuales en Euros:");
            if(entrada.hasNextFloat()){
                ingreso = entrada.nextFloat();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        if (edad > 16 && ingreso > 1000) {
            System.out.println("Debes tributar");
        }
        else{
            System.out.println("No debes tributar");
        }

        entrada.close();
    }
}