package programa6;

import java.util.Scanner;

public class Panaderia{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cantidadPan = 0;
        boolean error = true;

        do {
            System.out.println("Escribe el numero de barras de pan vendidas que no eran del dia:");
            if(entrada.hasNextInt()){
                cantidadPan = entrada.nextInt();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        System.out.printf("Precio regular por barra de pan: 3.49 Euros%nPrecio con descuento por barra que no es del dia: 1.396 Euros%nPrecio de %d barras vendidas que no eran del dia: %.2f Euros", cantidadPan, cantidadPan*1.396);

        entrada.close();
    }
}