/*Hacer un programa para ingresar tres números, luego mostrarlos ordenados de menor a mayor. */


package guia_3;

import java.util.Scanner;

public class EjercicioOnce {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        int a = sc.nextInt();
        System.out.println("Ingrese un segundo numero: ");
        int b = sc.nextInt();
        System.out.println("Ingrese un tercer numero: ");
        int c = sc.nextInt();
        sc.close();

        
        // a, b, c
        // a, c, b
        // b, a, c
        // b, c, a
        // c, a, b
        // c, b, a
        if (a < b && b < c) {
            System.out.println(a + " " + b + " " + c);
        } else if (a < c && c < b ) {
            System.out.println(a + " " + c + " " + b);
        } else if (b < a && a < c ) {
            System.out.println(b + " " + a + " " + c);
        } else if (b < c && c < a) {
            System.out.println(b + " " + c + " " + a);
        } else if (c < a && a < b) {
            System.out.println(c + " " + a + " " + b);
        } else if (c < b && b < a) {
            System.out.println(c + " " + b + " " + a);
        }

        /*if (a>b && a>c) {
            System.out.println(a);
            if (b>c) {
                System.out.println(b);
                System.out.println(c);
            } else {
                System.out.println(c);
                System.out.println(b);
            }
        }

        if (b>a && b>c) {
            System.out.println(b);
            if (c>a) {
                System.out.println(c);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(c);
            }
        }

        if (c>a && c>b) {
            System.out.println(c);
            if (b>a) {
                System.out.println(b);
                System.out.println(a);
            } else {
                System.out.println(a);
                System.out.println(b);
            }
        }*/ 
    }
}
