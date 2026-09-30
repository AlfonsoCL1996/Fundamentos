/*Hacer un programa para ingresar dos números. 
Si el segundo es distinto de cero, 
calcular la división del primero por el segundo
mostrar el resultado por pantalla; caso contrario, 
emitir un cartel aclarando que no se puede dividir por cero. */

package guia_3;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero, el que sea: ");
        int a = sc.nextInt();
        System.out.println("Ingrese OTRO numero... pero!... que no sea 0, ¿vvvvale?: ");
        int b = sc.nextInt();
        sc.close();

        if (b != 0) {
            System.out.println(a + " / " + b + " = " + (a/b));
        } else {
            System.out.println("Has escrito 0 eh, perro. Que perro eres tio ¬¬ si ya sabes que no se puede bro");
        }
    }
}
