/*Hacer un programa para ingresar un número
mostrar por pantalla un cartel aclaratorio si el mismo es PAR o IMPAR. */



package guia_2;

import java.util.Scanner;

public class parimpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero cualquiera: ");
        int numero = sc.nextInt();
        sc.close();

        if (numero%2 == 0) {
            System.out.println(numero + " es par");
        } else {
            System.out.println(numero + " es impar");
        }
    }
}