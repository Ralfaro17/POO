package programa13;

import java.util.Scanner;

public class Evaluacion {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float puntos = 0;
        boolean error = true;
        String rendimiento = "";

        do {
            System.out.println("Escribe tu puntuación:");
            if(entrada.hasNextFloat()){
                puntos = entrada.nextFloat();
                if(Float.compare(puntos, (float) 0.0) == 0 || Float.compare(puntos, (float) 0.4) == 0 || puntos >= 0.6){
                    error = false;
                }
            }
            else{
                entrada.nextLine();
                System.out.println("Has ingresado un valor no valido, vuelve a intentarlo");
            }
        } while (error);
        error = true;
        entrada.nextLine();

        if (puntos == 0.0) {
            rendimiento = "Inaceptable";
        }
        else if(puntos == 0.4){
            rendimiento = "Aceptable";
        }
        else{
            rendimiento = "Meritorio";
        }

        System.out.printf("En base a tu puntuación de: %.2f%nTu rendimiento es: %s%nRecibirás: %.2f Euros", puntos, rendimiento, puntos*2400);

        entrada.close();

    }
}
