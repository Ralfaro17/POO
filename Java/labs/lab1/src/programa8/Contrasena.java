package programa8;

import java.util.Scanner;

public class Contrasena {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String contraseña = "";

        System.out.println("Registra una contrasena");
        contraseña = entrada.nextLine();

        System.out.println("Vueve a ingresar la misma contraseña");
        if(contraseña.toLowerCase().equals(entrada.nextLine().toLowerCase())){
            System.out.println("Acceso concedido, las contrasenas coinciden");
        }
        else{
            System.out.println("Las contrasenas no coinciden, has fallado");
        }

        entrada.close();
    }
}
