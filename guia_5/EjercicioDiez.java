/* Hacer un programa que solicite una lista de números que corta cuando se ingresa un cero
luego emitir por pantalla el máximo de los números negativos y el mínimo de los números positivos. */

package guia_5;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        int n;
        int menorPositivo = Integer.MAX_VALUE;
        int mayorNegativo = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        while (n != 0) {
            if (n < 0) {
                if (n > mayorNegativo) {
                    mayorNegativo = n;
                }
            } else if (n > 0) {
                if (n < menorPositivo) {
                    menorPositivo = n;
                }
            }
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
        }
        sc.close();

        System.out.println("El maximo de los numeros negativos es: " + mayorNegativo);
        System.out.println("El menor de los numeros positivos es: " + menorPositivo);
    }
}
