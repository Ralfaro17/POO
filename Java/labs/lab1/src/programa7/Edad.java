package programa7;

import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int edad = 0;

        do {
            System.out.println("Ingresa tu edad:");
            if(entrada.hasNextInt()){
                error = false;
                edad = entrada.nextInt();
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        entrada.nextLine();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        }
        else{
            System.out.println("No eres mayor de edad");
        }

        entrada.close();
    }
}
