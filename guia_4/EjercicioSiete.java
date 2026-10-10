/*Hacer un programa que solicite 10 números y luego mostrar por pantalla el máximo de ellos y la posición en la que fue ingresado. */

package guia_4;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese numero: ");
        int numero = sc.nextInt();
        int mayor = numero;
        int posicion = 1;

        for (int i=2; i<10; i++) {
            System.out.println("Ingrese numero: ");
            int nuevoNumero = sc.nextInt();
            if (nuevoNumero>mayor) {
                mayor = nuevoNumero;
                posicion = i;
            }
        }
        System.out.println(mayor);
        System.out.println(posicion);
        sc.close();
    }    
}
