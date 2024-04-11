package programa4;

import java.util.Scanner;
import java.lang.Math;

public class MasaCorporal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double pesoEnKilos = 0, estaturaEnMetros = 0;
        boolean error = true;

        do {
            System.out.println("Escribe tu peso en Kilogramos:");
            if(entrada.hasNextDouble()){
                pesoEnKilos = entrada.nextDouble();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un valor valido, vuelve a intentarlo");
            }
        } while (error);
        entrada.nextLine();
        error = true;
        
        do {
            System.out.println("Escribe tu estatura en metros:");
            if(entrada.hasNextDouble()){
                estaturaEnMetros = entrada.nextDouble();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un valor valido, vuelve a intentarlo");
            }
        } while (error);
        entrada.nextLine();
        error = true;

        double imc = Math.ceil(pesoEnKilos/(estaturaEnMetros*estaturaEnMetros));
        System.out.printf("Tu indice de masa corporal es: %.2f%n", imc);

        entrada.close();
    }
}
