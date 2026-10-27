/* Hacer un programa que solicite UN número y luego calcule y 
emita un cartel aclaratorio si el mismo es primo o no es primo.
Nota: usando While. Ya lo hicimos con FOR, ahora con While. */

package guia_5;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int num = sc.nextInt();
        sc.close();

        if (esPrimo(num)) {
            System.out.println(num + " es primo");
        } else {
            System.out.println(num + " no es primo");
        }
    }

    public static boolean esPrimo(int n) {
        int i = 2;
        while (i < n) {
            if (n%i == 0) {
                return false;
            }
            i++;
        }
        return true;
    }
}
