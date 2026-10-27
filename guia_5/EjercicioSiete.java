/* Hacer un programa que solicite una lista de números que corta cuando se 
ingresa un cero y luego mostrar por pantalla el máximo de ellos 
y la posición en la que fue ingresado. */

package guia_5;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        int n = 1;
        int maximo = 0;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (n != 0) {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            if (n > maximo) {
                maximo = n;
                contador++;
            }
        }
        sc.close();
        System.out.println("Numero maximo: " + maximo);
        System.out.println("Indice: " + contador);
    }
}
