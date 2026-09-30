/* Hacer un programa para ingresar cuatro números distintos y luego mostrar por pantalla el mayor de ellos. */

package guia_2;

import java.util.Scanner;

public class elmayordecuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("INGRESARAS 4 NUMEROS");
        System.out.println("Ingrese el primer numero: ");
        int numA = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int numB = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int numC = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        int numD = sc.nextInt();
        sc.close();

        if (numA > numB && numA > numC && numA > numD) {
            System.out.println(numA + " es el mayor numero");
        } else if (numB > numA && numB > numC && numB > numD) {
            System.out.println(numB + " es el mayor numero");
        } else if (numC > numA && numC > numB && numC > numD) {
            System.out.println(numC + " es el mayor numero");
        } else {
            System.out.println(numD + " es el mayor numero");
        }
    }
}


/*  MANERA ABREVIADA
package guia_2;

import java.util.Scanner;

public class elmayordecuatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int numA = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numB = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int numC = sc.nextInt();
        System.out.print("Ingrese el cuarto número: ");
        int numD = sc.nextInt();
        sc.close();

        int mayor = Math.max(Math.max(numA, numB), Math.max(numC, numD));
        System.out.println(mayor + " es el mayor número");
    }
}
*/