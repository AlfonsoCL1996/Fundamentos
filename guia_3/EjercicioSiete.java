/*Hacer un programa para ingresar 4 números. 
Luego analizar e informar por pantalla si los mismos se encuentran ordenados de forma decreciente. */

package guia_3;

import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingresar segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingresar tercer numero: ");
        int c = sc.nextInt();
        System.out.println("Ingresar cuarto numero: ");
        int d = sc.nextInt();
        sc.close();

        if (a > b && b > c && c > d) {
            System.out.println("ESTAN ORDENADOS DE FORMA DECRECIENTE");
        } else {
            System.out.println("NO ESTAN ORDENADOS DE FORMA DECRECIENTE");
        }
    }
}
