/*Hacer un programa que solicite el ingreso de las notas del primer parcial y del segundo parcial de una alumna de programación.
El programa deberá analizar las notas y emitir la situación de la alumna según la siguiente escala:

**A.** Si tiene 8 o más en ambos parciales, emitir “aprobación directa”.

**B.** Si no tiene 8 o más en ambos, pero tiene aprobados ambos parciales (se aprueba con 6 o más), emitir “rinde examen final”.

**C.** Si tiene menos de 6 en alguno de los dos parciales, emitir “debe recuperar”.

El programa debe emitir solo un cartel, el que corresponda. */

package guia_3;

import java.util.Scanner;

public class EjercicioCinco {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del primer parcial: ");
        double primerParcial = sc.nextDouble();
        System.out.println("Nota del segundo parcial: ");
        double segunParcial = sc.nextDouble();
        sc.close();

        if (primerParcial >=8 && segunParcial >=8) {
            System.out.println("APROBADO DIRECTO");
        } else if (primerParcial >=6 && segunParcial >=6) {
            System.out.println("RINDE EXAMEN FINAL");
        } else {
            System.out.println("DEBE RECUPERAR");
        }
    }
}
