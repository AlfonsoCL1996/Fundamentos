/*Hacer un programa que solicite 20 números y luego mostrar por pantalla el menor de ellos y la posición en la que fue encontrado. */

package guia_4;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        int numero = 0;
        int posicion = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        int menor = numero;
        
        for (int i=2; i<20; i++) {
            System.out.println("Ingrese un numero: ");
            int nuevoNumero = sc.nextInt();
            if (nuevoNumero<menor) {
                menor = nuevoNumero;
                posicion = i;
            }
        }
        System.out.println(menor);
        System.out.println(posicion);
        sc.close();
    }
}
