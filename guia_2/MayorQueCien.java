/*Hacer un programa para ingresar cuatro números 
y luego mostrar por pantalla cuáles son mayores a 100. */

package guia_2;

import java.util.Scanner;

public class MayorQueCien {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        Scanner sc = new Scanner(System.in);
        /*System.out.println("Primer numero: ");
        numeros[0] = sc.nextInt();
        System.out.println("Segundo numero: ");
        numeros[1] = sc.nextInt();
        System.out.println("Tercer numero: ");
        numeros[2] = sc.nextInt();
        System.out.println("Cuarto numero: ");
        numeros[3] = sc.nextInt();*/
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Escribe el numero " + (i+1) + ": ");
            numeros[i] = sc.nextInt();
        }
        sc.close();

        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] > 100) {
                System.out.println(numeros[i]);
            }
        }
    }
}
