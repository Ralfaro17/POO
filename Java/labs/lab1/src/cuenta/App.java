package cuenta;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa el nombre de tu cuenta");
        String nombre = entrada.nextLine();

        System.out.println("Ingresa el saldo de la cuenta");
        double saldo = entrada.nextDouble();

        System.out.print("\033[H\033[2J");  
        System.out.flush();
        CuentaSaldo cuenta1 = new CuentaSaldo(nombre, saldo);

        System.out.println("VALORES INICIALES:");
        System.out.printf("Nombre: %s%n", cuenta1.getNombre());
        System.out.printf("Saldo: %s%n%n", cuenta1.getSaldo());

        System.out.println("Ingresa un nuevo saldo para actualizar tu saldo actual:");
        cuenta1.actualizarSaldo(entrada.nextDouble());
        System.out.flush();
        System.out.println("Ingresa un nuevo nombre para tu cuenta:");
        nombre = entrada.nextLine();
        cuenta1.setNombre(nombre);


        System.out.print("\033[H\033[2J");  
        System.out.flush();
        System.out.println("VALORES MODIFICADOS:");
        System.out.printf("Nombre: %s%n", cuenta1.getNombre());
        System.out.printf("Saldo: %s%n", cuenta1.getSaldo());

        entrada.close();

    }
}
