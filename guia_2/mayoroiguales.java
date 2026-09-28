/* Hacer un programa para ingresar dos números y que luego emita por pantalla el mayor de ellos 
o un cartel aclaratorio “Son iguales” en el caso de que así sea.
 */



package guia_2;

import java.util.Scanner;

public class mayoroiguales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numA, numB;
        System.out.println("Ingrese un numero: ");
        numA = sc.nextInt();
        System.out.println("Ingrese otro numero: ");
        numB = sc.nextInt();

        if (numA > numB) {
            System.out.print("El numero mayor es: " + numA);
        } else if (numB > numA) {
            System.out.println("El numero mayor es: " + numB);
        } else {
            System.out.println("Los numeros " + numA + " y " + numB + " son iguales.");
        }

        sc.close();
    }
}
