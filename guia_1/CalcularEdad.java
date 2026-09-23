package guia_1;
import java.util.Scanner;

public class CalcularEdad {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int añoNacimiento = 0;
        int añoActual = 0;
        int edad = 0;

        System.out.println("Escribe el año en que naciste: ");
        añoNacimiento = scan.nextInt();
        System.out.println("Escribe el año actual: ");
        añoActual = scan.nextInt();

        System.out.println("Tu edad es: " + (edad = añoActual - añoNacimiento));
        scan.close();
    }
}
