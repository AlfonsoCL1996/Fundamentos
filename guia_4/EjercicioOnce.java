/*Hacer un programa para ingresar 10 números
luego calcule y emita el mayor de los primos de la lista. 
En caso de no haber ningún número primo, deberá aclararlo con un cartel. */

package guia_4;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {
        int primoMayor = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=10; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            if (esPrimo(numero)) {
                if (numero>primoMayor) {
                    primoMayor = numero;
                }
            }
        }
        if (primoMayor == Integer.MIN_VALUE) {
            System.out.println("NO HAY PRIMOS");
        } else {
            System.out.println("El mayor primo es " + primoMayor);
        }
        sc.close();

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
