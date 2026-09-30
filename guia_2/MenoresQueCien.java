/*Hacer un programa para ingresar cuatro números
luego mostrar por pantalla cuántos son menores a 100.*/

package guia_2;

import java.util.Scanner;

public class MenoresQueCien {
    public static void main(String[] args) {

        int[] numeros = new int[4];
        int contador = 0;

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Escribe el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] < 100) {
                contador++;
            }
        }
        System.out.println("Cantidad de numeros menores que 100: " + contador);
    }
}
