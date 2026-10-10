/* Hacer un programa para ingresar tres números, 
emitir un cartel aclaratorio si la suma de los dos primeros es mayor al producto del segundo con el tercero. */

package guia_3;

import java.util.Scanner;

public class EjercicioDoce {
    public static void main(String[] args) {
        int a, b, c;
        int suma, producto;

        Scanner sc = new Scanner(System.in);
        System.out.println("Primer numero: ");
        a = sc.nextInt();
        System.out.println("Segundo numero: ");
        b = sc.nextInt();
        System.out.println("Tercer numero: ");
        c = sc.nextInt();
        sc.close();

        suma = a + b;
        producto = b * c;

        if (suma > producto) {
            System.out.println(suma + " es mayor que " + producto);
        }
    }    
}
