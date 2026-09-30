/* Hacer un programa para ingresar cuatro números distintos y luego mostrar por pantalla el menor de ellos. */

package guia_2;

import java.util.Scanner;

public class elmenordecuatro {
    public static void main(String[] args) {
        
        int numA, numB, numC, numD;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        numA = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        numB = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        numC = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        numD = sc.nextInt();
        sc.close();

        int menor = Math.min(Math.min(numA, numB), Math.min(numC, numD));
        System.out.println(menor);
    }
}
