/* Hacer un programa que solicite UN número y luego calcule y emita un cartel aclaratorio si el mismo es primo o no es primo.
Nota: un número es primo cuando es divisible únicamente por 1 y por sí mismo.*/

package guia_4;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        sc.close();

        if (esPrimo(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " no es primo");
        }
    }


    public static boolean esPrimo (int n) {
        for (int i=2; i<n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}
