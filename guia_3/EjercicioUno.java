/* Hacer un programa que solicite el ingreso de un número, 
luego emitir un cartel por pantalla aclarando si el mismo es múltiplo de 5. */

package guia_3;

import java.util.Scanner;

public class EjercicioUno {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        numero = sc.nextInt();
        if (numero%5 == 0) {
            System.out.println(numero + " es multiplo de 5");
        } else {
            System.out.println(numero + " no es multiplo de 5");
        }
        sc.close();
    }
}
