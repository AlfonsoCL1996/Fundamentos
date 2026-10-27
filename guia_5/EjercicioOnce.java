/* Hacer un programa para ingresar una lista de números que corta cuando se ingresa un cero y luego mostrar: 
la cantidad de números primos
la cantidad de números pares
la cantidad de positivos 
la cantidad de negativos. */

package guia_5;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        int n;
        int contadorPrimos = 0;
        int contadorPares = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        n = sc.nextInt();

        while(n != 0) {
            if (esPrimo(n)) {
                contadorPrimos++;
            }
            if (n%2 == 0) {
                contadorPares++;
            }
            if (n > 0) {
                contadorPositivos++;
            }
            if (n < 0) {
                contadorNegativos++;
            }
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
        }
        sc.close();

        System.out.println("Cantidad de primos encontrados: " + contadorPrimos);
        System.out.println("Cantidad de pares encontrados: " + contadorPares);
        System.out.println("Cantidad de positivos encontrados: " + contadorPositivos);
        System.out.println("Cantidad de negativos encontrados: " + contadorNegativos);
    }


    public static boolean esPrimo(int n) {
        if (n <= 1) {
            return false;
        }
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
