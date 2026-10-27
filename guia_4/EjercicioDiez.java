/* Hacer un programa que solicite 20 números
luego emitir por pantalla el máximo de los números pares 
y el mínimo de los números impares.*/

package guia_4;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {

        int parMaximo = Integer.MIN_VALUE;
        int imparMinimo = Integer.MAX_VALUE;

        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=20; i++) {
            System.out.println("Ingrese un numero: ");
            int numero = sc.nextInt();
            if (numero%2==0) {
                if (numero > parMaximo) {
                    parMaximo = numero;
                }
            } else {
                if (numero < imparMinimo) {
                    imparMinimo = numero;
                }
            }
        }
        sc.close();

        System.out.println("Maximo de los pares: " + parMaximo);
        System.out.println("Minimo de los impares: " + imparMinimo);
    }
}
