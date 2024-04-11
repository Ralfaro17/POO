package programa5;

import java.util.Scanner;

public class Jugueteria {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int cantidadPayasos = 0, cantidadMunecas = 0;
        boolean error = true;
    
        do{
            System.out.println("Escribe la cantidad de payasos vendidos en el último pedido:");
            if(entrada.hasNextInt()){
                cantidadPayasos = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un valor valido, vuelve a intentarlo");
            }
        }while(error);
        entrada.nextLine();
        error = true;
    
        do {
            System.out.println("Escribe la cantidad de munecas vendidas en el último pedido:");
            if(entrada.hasNextInt()){
                cantidadMunecas = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("No has ingresado un valor valido, vuelve a intentarlo");
            }
        } while (error);
        entrada.nextLine();
        error = true;

        System.out.printf("El peso total del pedido a enviar es de %dg%n", (cantidadPayasos*112)+(cantidadMunecas*75));

        entrada.close();
    }

}
