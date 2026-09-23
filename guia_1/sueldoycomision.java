package guia_1;
/* Una casa de computación paga a sus empleados un sueldo fijo de ARS15000 
más una comisión del 5% sobre el total facturado por cada empleado. 
Hacer un programa para ingresar el total facturado por un empleado 
y que luego calcule y emita por pantalla el sueldo total a cobrar por el mismo. */

import java.util.Scanner;

public class sueldoycomision {
    public static void main(String[] args) {
        
        final double sueldoFijo = 15000;
        double facturacion = 0;
        double comision = 0;
        double sueldoFinal = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Cuanto has facturado?");
        facturacion = scan.nextDouble();
        comision = facturacion * 0.05;
        sueldoFinal = sueldoFijo + comision;

        System.out.println("Tu sueldo + comision por facturacion es: " + sueldoFinal);
        System.out.println("Su facturacion fue de: " + facturacion);
        System.out.println("Su comision del 5% sobre su facturacion: " + comision);

        scan.close();
    }
}
