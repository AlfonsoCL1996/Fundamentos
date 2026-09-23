package guia_1;
/* Hacer un programa que permita ingresar por teclado dos números y que luego muestre por pantalla la suma, la resta,
la multiplicación y la división de dichos números Se deben mostrar cuatro resultados en pantalla.
Los números deben ser solicitados una única vez. */

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        double numA, numB;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un primer numero: ");
        numA = scan.nextDouble();
        System.out.println("Ingrese un segundo numero: ");
        numB = scan.nextDouble();
        scan.close();

        double suma = numA + numB;
        System.out.println(suma);

        double resta = numA - numB;
        System.out.println(resta);

        double multiplicacion = numA * numB;
        System.out.println(multiplicacion);

        double division;
        if (numB == 0) {
            System.out.println("Imposibilidad de division entre 0");
        } else {
            division = numA / numB;
            System.out.println(division);
        }
    }
}
