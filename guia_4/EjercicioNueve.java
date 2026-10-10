/*Hacer un programa que solicite 20 edades y luego calcule el promedio de edad de aquellas personas mayores a 18 años.*/

package guia_4;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {
        int mayoresDieciocho = 0;
        int totalEdad = 0;
        Scanner sc = new Scanner(System.in);
        for (int i=1; i<=20; i++) {
            System.out.println("Ingrese una edad: ");
            int edad = sc.nextInt();
            if (edad >= 18) {
                totalEdad = totalEdad + edad;
                mayoresDieciocho++;
            }
        }
        int promedioEdad = totalEdad / mayoresDieciocho;
        System.out.println("El promedio de personas mayores de 18 es: " + promedioEdad);
        sc.close();
    }    
}
