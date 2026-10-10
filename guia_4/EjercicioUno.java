/*Hacer un programa que solicite el ingreso de 10 números y que muestre el mayor de ellos por pantalla. 
Solo se debe emitir UN valor por pantalla. */

package guia_4;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i=0; i<numeros.length; i++) {
            System.out.println("Ingrese un numero: ");
            numeros[i] = sc.nextInt();
        }
        int numeroMayor = numeros[0];
        for (int i=0; i<numeros.length; i++) {
            if (numeros[i] >= numeroMayor) {
                numeroMayor = numeros[i];
            }
        }
        System.out.println(numeroMayor);
        sc.close();
    }
}
