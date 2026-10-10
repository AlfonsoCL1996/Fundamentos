/*Hacer un programa que solicite 20 números
calcule y emita por pantalla cuántos son positivos (mayores a cero). 
Se debe mostrar un solo valor: el conteo final. */

package guia_4;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args) {
        int numeros;
        int positivos = 0;

        Scanner sc = new Scanner(System.in);
        for (int i=0; i<20; i++) {
            System.out.println("Ingrese un numero: ");
            numeros = sc.nextInt();
            if (numeros >0) {
                positivos++;
            }
        }
        System.out.println(positivos);
        sc.close();
    }    
}
