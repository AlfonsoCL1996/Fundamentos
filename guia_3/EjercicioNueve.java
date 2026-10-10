/* Una importante marca de computadoras permite elegir cierta configuración del equipo a comprar. 
Para ello existe la siguiente escala de precios:

|            |    i5 (1) | i7 (2)   | i9 (3)   |
| 8 RAM (1)  | USD 800   | USD 900  | USD 1200 |
| 16 RAM (2) | USD 900   | USD 1000 | USD 1400 |
| 32 RAM (3) | USD 1000  | USD 1400 | USD 2000 |

Además, el equipo viene con un disco que permite almacenar 500 GB de información, pudiéndose ampliar a 1 TB, 
si así lo desea, el cual tiene un costo adicional de USD 300.

Hacer un programa que solicite la opción de procesador, la opción de memoria RAM, 
y si extiende el disco o no (ingresa 1 para extender y 0 para no extender). 
Calcular y emitir por pantalla el monto de la máquina seleccionada.*/


package guia_3;

import java.util.Scanner;

public class EjercicioNueve {
    public static void main(String[] args) {

        int[][] precios = {
            {800, 900, 1200},
            {900, 1000, 1400},
            {1000, 1400, 2000}
        };

        Scanner sc = new Scanner(System.in);
        System.out.println("Seleccione memoria RAM");
        System.out.println("8 GB: Escriba 1");
        System.out.println("16 GB: Escriba 2");
        System.out.println("32 GB: Escriba 3");
        int memoriaRam = sc.nextInt();

        System.out.println("Selecciona procesador");
        System.out.println("i5: Escriba 1");
        System.out.println("i7: Escriba 2");
        System.out.println("i9: Escriba 3");
        int procesador = sc.nextInt();

        System.out.println("¿Quieres ampliar el almacenamiento del disco hasta 1TB?");
        System.out.println("Escribe 1 para ampliar");
        System.out.println("Escribe 0 para NO ampliar");
        System.out.println("(todos los equipos tienen 500 GB de almacenamiento en disco)");
        int ampliacion = sc.nextInt();
        sc.close();

        int precioBase = precios[memoriaRam-1][procesador-1];
        if (ampliacion == 1) {
            precioBase = precioBase + 300;
        }
        System.out.println("Su precio final: " + precioBase + " USD");
    }
}
