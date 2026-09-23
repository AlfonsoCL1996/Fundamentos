package guia_1;
/* Hacer un programa para ingresar por teclado las tres notas de exámenes de un alumno
luego calcule y emita por pantalla el promedio final. */

import java.util.Scanner;

public class calculodepromedio {
    public static void main(String[] args) {
        double nota1, nota2, nota3;

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingresar nota: ");
        nota1 = scan.nextDouble();
        System.out.println("Ingresar nota: ");
        nota2 = scan.nextDouble();
        System.out.println("Ingresar nota: ");
        nota3 = scan.nextDouble();

        double totalNotas = nota1 + nota2 + nota3;
        double mediaNotas = totalNotas/3;

        System.out.println("Media de: " + mediaNotas);

        scan.close();
    }
}
