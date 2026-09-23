package guia_1;
/* Hacer un programa para ingresar por teclado los metros cuadrados totales de un predio y los metros cuadrados cubiertos;
luego calcular y mostrar por pantalla el porcentaje de metros cuadrados cubiertos y el porcentaje de metros cuadrados descubiertos.

Llegado a este punto hemos analizado varios ejercicios y entendido cuál es la forma de encararlos, ¿verdad? 
En este caso hasta podemos hacer dibujitos para representar el predio, la porción cubierta y la no descubierta 
y entender cuáles son los cálculos necesarios para obtener la info que necesitamos. Clave antes de arrancar a programar.
En este algoritmo ingresamos los metros totales en MT y los metros cubiertos en MC.
En la primera caja de proceso calculamos los metros descubiertos en MD restando al total lo cubierto.
En la segunda caja de proceso obtenemos el porcentaje de metros cubiertos, este resultado se aloja en la variable PMC.
En la ultima instrucción de proceso obtenemos el porcentaje de metros descubiertos que se alojará en PMD.
Finalmente mostramos los resultados en pantalla PMC, PDM; porcentaje cubierto y porcentaje descubierto respectivamente.
*/

import java.util.Scanner;

public class metros {
    public static void main(String[] args) {
        double metrosTotales = 0, metrosCubiertos = 0, porcentajeCubierto = 0, porcentajeDescubierto = 0;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Ingrese los metros totales de su terreno: ");
        metrosTotales = scan.nextDouble();
        System.out.print("Sus metros totales: " + metrosTotales);
        
        System.out.println("Ingrese los metros cuadrados cubiertos: ");
        metrosCubiertos = scan.nextDouble();
        System.out.println("Sus metros cubiertos: " + metrosCubiertos);

        System.out.println("Porcentaje de terreno cubierto: ");
        System.out.println(porcentajeCubierto = (metrosCubiertos/metrosTotales)*100);

        System.out.println("Porcentaje de terreno descubierto: ");
        System.out.println(porcentajeDescubierto = 100 - porcentajeCubierto);

        scan.close();
    }
}
