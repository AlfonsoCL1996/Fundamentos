package guia_1;
/* Una universidad desea conocer los porcentajes de mujeres y hombres en las carreras de ciencias exactas.
Se solicita un programa para cargar la cantidad de mujeres y la cantidad de hombres 
y que el mismo calcule y emita por pantalla los porcentajes correspondientes. */

import java.util.Scanner;

public class hombresymujeres {
    public static void main(String[] args) {
        int hombres;
        int mujeres;
        double totalPersonas;
        double porcentajeHombres;
        double porcentajeMujeres;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Cantidad de hombres: ");
        hombres = scan.nextInt();

        System.out.println("Cantidad de mujeres: ");
        mujeres = scan.nextInt();

        totalPersonas = hombres + mujeres;

        porcentajeHombres = (hombres / totalPersonas) * 100;
        porcentajeMujeres = (mujeres / totalPersonas) * 100;

        System.out.println("Porcentaje de hombres: " + porcentajeHombres + "%");
        System.out.println("Porcentaje de mujeres: " + porcentajeMujeres + "%");

        scan.close();
    }
}