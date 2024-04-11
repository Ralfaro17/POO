package asignacion;

import java.util.Scanner;

public class Estudiante {
    private String nombre;
    private String carnet;
    private String grupo;
    Scanner scan = new Scanner(System.in);

    // constructor
    public Estudiante(String nombre, String carnet, String grupo){
        this.nombre = nombre;
        this.carnet = carnet;
        this.grupo = grupo;
    }

    // getters
    public String getNombre(){
        return nombre;
    }

    public String getGrupo(){
        return grupo;
    }

    public String getCarnet(){
        return carnet;
    }

    //setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setGrupo(String grupo){
        this.grupo = grupo;
    }

    public void setCarnet(String carnet){
        this.carnet = carnet;
    }


    //  métodos
    public int calificaciones(){
        System.out.println("Introduzca la calificación");
        int calificacion = scan.nextInt();
        
        return calificacion;
    }

    public int[] getCalificacionLetra(int calificacion, int[] letras){
        if (calificacion < 0) {
            return letras;
        }
        switch (calificacion/10) {
            case 10:
            case 9:
                letras[0]++;
                break;
            case 8:
                letras[1]++;;
                break;
            case 7:
                letras[2]++;;
                break;
            case 6:
                letras[3]++;;
                break;
            default:
                letras[4]++;;
                break;
        }
        return letras;
    }

    public double getPromedio(int total, int contador){
        double promedio = (double) total/contador;
        return promedio;
    }
}
