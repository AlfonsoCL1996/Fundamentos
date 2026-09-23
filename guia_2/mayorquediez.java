/* Hacer un programa para ingresar un número y luego se emita por pantalla un cartel aclaratorio 
si “Es mayor a 10” o “No es mayor a 10”.*/



package guia_2;
import java.util.Scanner;

public class mayorquediez {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        num = sc.nextInt();
        if (num > 10) {
            System.out.println(num + "Es mayor que 10");
        } else {
            System.out.println(num + "Es menor que 10");
        }
        sc.close();
    }
}
