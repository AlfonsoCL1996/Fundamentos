/*Hacer un programa que solicite el ingreso de dos números y luego calcular:

**a.** La resta, si el primero es mayor que el segundo.

**b.** La suma, si son iguales.

**c.** El producto, si el primero es menor.

Se deberá emitir un cartel por pantalla con el resultado correspondiente. */

package guia_3;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer num: ");
        int a = sc.nextInt();
        System.out.println("Ingrese segundo num:");
        int b = sc.nextInt();
        sc.close();

        if (a > b) {
            System.out.println(a + " - " + b + " = " + (a-b));
        } else if (a == b) {
            System.out.println(a + " + " + b + " = " + (a+b));
        } else if (a < b) {
            System.out.println(a + " * " + b + " = " + (a*b));
        }
    }
}
