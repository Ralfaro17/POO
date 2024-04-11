package programa14;

import java.util.Scanner;

public class Juegos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean error = true;
        int edad = 0;

        do {
            System.out.println("Escribe tu edad:");
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
        
        if(edad < 4){
            System.out.println("No tienes que pagar por tu entrada, es gratis");
        }
        else if(edad >= 4 && edad <= 18){
            System.out.println("El precio de tu entrada es de 5 Euros");
        }
        else{
            System.out.println("El precio de tu entrada es de 10 Euros");
        }

        entrada.close();
    }
}
