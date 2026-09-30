/*Hacer un programa para ingresar cinco números distintos y luego mostrar por pantalla el mayor y el menor de ellos.*/

package guia_2;

import java.util.Scanner;

public class MayoryMenor {
    public static void main(String[] args) {

        int numA, numB, numC, numD, numE;

        Scanner sc = new Scanner(System.in);
        System.out.println("Pimer nunmero: ");
        numA = sc.nextInt();
        System.out.println("Segundo numero: ");
        numB = sc.nextInt();
        System.out.println("Tercer numero: ");
        numC = sc.nextInt();
        System.out.println("Cuarto numero: ");
        numD = sc.nextInt();
        System.out.println("Quinto numero: ");
        numE = sc.nextInt();
        sc.close();

        /*
        int mayor = (Math.max(Math.max(numA, numB), Math.max(numC, numD)));
        int max = (Math.max(mayor, numE));
        System.out.println("Mayor numero " + max);

        int menor = (Math.min(Math.min(numA, numB), Math.min(numC, numD)));
        int min = (Math.min(menor, numE));
        System.out.println("Menor numero: " + min);
        */

        int mayor = numA;
        if (numB > mayor) mayor = numB;
        if (numC > mayor) mayor = numC;
        if (numD > mayor) mayor = numD;
        if (numE > mayor) mayor = numE;
        System.out.println(mayor);

        int menor = numA;
        if (numB < menor) menor = numB;
        if (numC < menor) menor = numC;
        if (numD < menor) menor = numD;
        if (numE < menor) menor = numE;
        System.out.println(menor);
    }
}


