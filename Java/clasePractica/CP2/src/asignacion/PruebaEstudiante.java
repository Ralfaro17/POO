package asignacion;

public class PruebaEstudiante {
    public static void main(String[] args) {
        Estudiante alumno1 = new Estudiante("Enyel", "2023-0599U", "2M1-CO");
        System.out.printf("%s%n%s%n%n",
        "Introduzca las calificaciones en un rango de 0-100",
        "Escriba un -1 y presione enter al momento de ingresar una nota para detener el ciclo");

        int total = 0;
        int contador = 0;
        int[] letras = {0,0,0,0,0};
        int nota = 0;

        while (true){
            nota = alumno1.calificaciones();
            if(nota == -1){
                break;
            }
            total += nota;
            contador++;
            alumno1.getCalificacionLetra(nota, letras);
        }

        System.out.printf("%nReporte de calificación%n");
        if (contador != 0){
            double promedio = alumno1.getPromedio(total, contador);
            System.out.printf("El total de %d calificaciones es %d%n", contador, total);
            System.out.printf("El promedio de la clase es %.2f%n", promedio);

            System.out.printf("%s%n%s%d%n%s%d%n%s%d%n%s%d%n%s%d%n",
            "Cantidad de notas en letras",
            "A: ", letras[0],
            "B: ", letras[1],
            "C: ", letras[2],
            "D: ", letras[3],
            "F: ", letras[4]);
        }
        else{
            System.out.println("No se introdujeron notas");
        }
    }
}
