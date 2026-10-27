/* Realizar nuevamente el ejercicio 8, pero ahora debe devolver además la posición en la que fue encontrado cada uno de los mínimos. */

package guia_5;

import java.util.Scanner;

public class EjercicioNueve {
        public static void main(String[] args) {
        int numero = 1;
        int menor = Integer.MAX_VALUE;
        int segundoMenor = Integer.MAX_VALUE;
        int contadorVueltas = 0;
        int posicionUno = 0;
        int posicionDos = 0;
        Scanner sc = new Scanner(System.in);
        while (numero != 0) {
            System.out.println("Ingrese un numero: ");
            numero = sc.nextInt();
            if (numero != 0){
                contadorVueltas++;
                if (numero < menor) {
                    segundoMenor = menor;
                    posicionDos = posicionUno;
                    menor = numero;
                    posicionUno = contadorVueltas;
                } else if (numero < segundoMenor) {
                    segundoMenor = numero;
                    posicionDos = contadorVueltas;
                }
            }
        }
        sc.close();
        System.out.println("El menor numero es: " + menor);
        System.out.println("Posicion del numero menor: " + posicionUno);
        System.out.println("El segundo menor es: " + segundoMenor);
        System.out.println("Posicion del segundo menor: " + posicionDos);
    }
}
