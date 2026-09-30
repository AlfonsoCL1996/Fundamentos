/*Hacer un programa para ingresar por teclado la longitud de los tres lados de un triángulo 
y que luego determine e informe con un cartel aclaratorio a qué tipo de triángulo corresponde:

**a. Equilátero:** cuando los tres lados sean iguales.

**b. Isósceles:** cuando dos de los tres lados sean iguales.

**c. Escaleno:** cuando todos los lados sean distintos. */

package guia_3;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String[] args) {
        double x, y, z;

        Scanner sc = new Scanner(System.in);
        System.out.println("Longitud x: ");
        x = sc.nextDouble();
        System.out.println("Longitud y: ");
        y = sc.nextDouble();
        System.out.println("Longitud z: ");
        z = sc.nextDouble();
        sc.close();

        if (x == y && x == z) {
            System.out.println("ES EQUILATERO");
        } else if (x == y || x == z || y == z) {
            System.out.println("ES ISOSCELES");
        } else if (x != y && x != z && z != y) {
            System.out.println("ES ESCALENO");
        }
    }
}
