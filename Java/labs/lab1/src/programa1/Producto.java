package programa1;

import java.util.Scanner;

public class Producto{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int numero1 = 0, numero2 = 0, numero3 = 0;
        boolean error = true;

        System.out.println("Escribe 3 numero enteros");
        do {
            System.out.print("numero 1: ");
            if(entrada.hasNextInt()){
                numero1 = entrada.nextInt();
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
            System.out.print("numero 2: ");
            if(entrada.hasNextInt()){
                numero2 = entrada.nextInt();
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
            System.out.print("numero 3: ");
            if(entrada.hasNextInt()){
                numero3 = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        entrada.nextLine();
        error = true;

        int total = numero1 * numero2 * numero3;
        System.out.printf("El producto de los 3 números anteriores es %d%n", total);
        entrada.close();
    }
}