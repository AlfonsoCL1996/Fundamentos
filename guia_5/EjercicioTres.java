/* Hacer un programa que solicite la edad de un grupo de personas. 
El programa deberá pedir edades hasta que se ingrese una edad menor a 18 años. 
Deberá mostrar por pantalla cuántas personas mayores se registraron. */


package guia_5;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        int edad = 18;
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        while (edad >= 18) {
            System.out.println("Ingresa edad: ");
            edad = sc.nextInt();
            if (edad >= 18) {
                contador++;
            }
        }
        sc.close();
        System.out.println("Numero de personas mayores de 18: " + contador);
    }
}
