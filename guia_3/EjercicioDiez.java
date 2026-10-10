/*Hacer un programa que solicite cuatro números. Emitir un cartel aclaratorio si son todos iguales entre sí, 
caso contrario, no emitir nada. */


package guia_3;

import java.util.Scanner;

public class EjercicioDiez {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        int c = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        int d = sc.nextInt();
        sc.close();

        if (a == b && b == c && c == d) {
            System.out.println("TODOS LOS NUMEROS SON IGUALES");
        }
    }    
}
