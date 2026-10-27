/* Hacer un programa que solicite dos números
luego muestre los números entre el menor y el mayor de ellos.
Acordate: usando While. */

package guia_5;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int n = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        int m = sc.nextInt();
        sc.close();
        int mayor;
        int menor;
        if (n > m) {
            mayor = n;
            menor = m;
        } else {
            mayor = m;
            menor = n;
        }
        int contador = menor;
        while (contador < mayor) {
            contador++;
            System.out.println(contador);
        }
    }    
}
