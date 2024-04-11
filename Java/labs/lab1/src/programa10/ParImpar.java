package programa10;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = 0;
        boolean error = true;

        do {
            System.out.println("Escribe un numero entero para saber si es par o impar:");
            if(entrada.hasNextInt()){
                numero = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();
        
        if(numero % 2 == 0){
            System.out.println("El numero ingresado es par");
        }
        else{
            System.out.println("El numero ingresado es impar");
        }
        
        entrada.close();
    }
}
