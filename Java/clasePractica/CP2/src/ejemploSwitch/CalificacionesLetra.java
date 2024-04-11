package ejemploSwitch;
import java.util.Scanner;

public class CalificacionesLetra{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int total = 0, contador = 0, aCuenta = 0, bCuenta = 0, cCuenta = 0, dCuenta = 0, fCuenta = 0;

        // imprimir encabezado
        System.out.printf("%s%n%s%n%s%n",
        "Introduzca las calificaciones en un rango de 0-100",
        "Escriba un indicador de fin de linea para terminar el ciclo",
        "Presione ctrl + z y enter");

        // itera hasta que presione ctrl + z
        while (entrada.hasNext()) {
            System.out.println("Introduzca la calificación");
            int calificación = entrada.nextInt();
            total += calificación;
            contador++;
            switch (calificación/10) {
                case 10:
                case 9:
                    ++aCuenta;
                    break;
                case 8:
                    ++bCuenta;
                    break;
                case 7:
                    ++cCuenta;
                    break;
                case 6:
                    ++dCuenta;
                    break;
                default:
                    ++fCuenta;
                    break;
            }
        }

        System.out.println("Reporte de calificación");
        if (contador != 0){
            double promedio = (double) total/contador;
            System.out.printf("El total de %d calificaciones es %d%n", contador, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);

            System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "Cantidad de notas en letras",
            "A: ", aCuenta,
            "B: ", bCuenta,
            "C: ", cCuenta,
            "D: ", dCuenta,
            "F: ", fCuenta);
        }
        else{
            System.out.println("No se introdujeron notas");
        }
        entrada.close();
    }
}
