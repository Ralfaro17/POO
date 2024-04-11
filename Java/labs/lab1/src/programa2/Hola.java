package programa2;

import java.util.Scanner;

public class Hola {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe tu nombre:");
        String nombre = entrada.nextLine();
        System.out.printf("¡Hola %s!%n", nombre);
        entrada.close();
    }
}
