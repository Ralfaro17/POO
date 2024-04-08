package programa12;

import java.util.Scanner;

public class Renta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double rentaAnual = 0;
        boolean error = true;

        do {
            System.out.println("Escribe tu renta anual en euros:");
            if(entrada.hasNextDouble()){
                rentaAnual = entrada.nextDouble();
                error = false;
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        if (rentaAnual < 10000) {
            System.out.println("Te corresponde un tipo impositivo del 5%");
        }
        else if(rentaAnual >= 10000 && rentaAnual < 20000 ){
            System.out.println("Te corresponde un tipo impositivo del 15%");
        }
        else if(rentaAnual >= 20000 && rentaAnual < 35000){
            System.out.println("Te corresponde un tipo impositivo del 20%");
        }
        else if(rentaAnual >= 35000 && rentaAnual < 60000){
            System.out.println("Te corresponde un tipo impositivo del 30%");
        }
        else{
            System.out.println("Te corresponde un tipo impositivo del 45%");
        }


        entrada.close();
    }
}
