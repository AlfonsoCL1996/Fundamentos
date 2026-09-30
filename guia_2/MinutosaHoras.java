/*Hacer un programa para ingresar un valor que estará expresado en minutos. 
Si los minutos superan los 60, pasar el valor a horas, de lo contrario dejarlo en minutos. 
Mostrar el resultado en pantalla aclarando si se muestran minutos u horas. */

package guia_2;

import java.util.Scanner;

public class MinutosaHoras {
    public static void main(String[] args) {
        double minutos;
        double horas;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un valor de tiempo en minutos: ");
        minutos = sc.nextDouble();
        if (minutos > 60) {
            System.out.println((horas = minutos/60) + " HORAS");
        } else {
            System.out.println(minutos + " MINUTOS");
        }
        sc.close();
    }
}
