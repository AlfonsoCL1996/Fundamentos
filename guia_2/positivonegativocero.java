/* Hacer un programa para ingresar un número y luego se emita un cartel por pantalla 
“Positivo” si el número es mayor a cero, 
“Negativo” si el número es menor a cero 
“Cero” si el número es igual a cero. */


package guia_2;

import java.util.Scanner;

public class positivonegativocero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.println("Ingrese un numero, pudiendo ser positivo o negativo: ");
        numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("El numero " + numero + " es mayor que 0");
        } else if (numero < 0) {
            System.out.println("El numero " + numero + " es menor que 0");
        } else {
            System.out.println("El numero " + numero + " es igual que 0");
        }

        sc.close();
    }
}
