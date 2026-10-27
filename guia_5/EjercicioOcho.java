/* Hacer un programa que solicite una lista de números 
que corta cuando se ingresa un cero
luego mostrar por pantalla el menor y el segundo menor. */

package guia_5;

import java.util.Scanner;

public class EjercicioOcho {
    public static void main(String[] args) {
        int numero = 1;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
        Scanner sc = new Scanner(System.in);
        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero != 0){
                if (numero < menor) {
                    segundoMenor = menor;
                    menor = numero;
                } else if (numero < segundoMenor) {
                    segundoMenor = numero;
                }
            }
        }
        sc.close();
        System.out.println("El menor numero es: " + menor);
        System.out.println("El segundo menor es: " + segundoMenor);
    }
}
