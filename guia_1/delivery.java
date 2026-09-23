package guia_1;
/*Una importante cadena de delivery cuenta con una promoción por tiempo limitado en la que otorga un 15% de descuento sobre 
el total del valor de la compra realizada. 
Hacer un programa para solicitar el monto total 
y el mismo calcule y emita por pantalla el total a cobrar con el descuento aplicado.*/

import java.util.Scanner;

public class delivery {
    public static void main(String[] args){
        double precioTotal;
        double precioDescontado;

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Introduce su precio de compra total para aplicar un 15% de descuento: ");
        precioTotal = scan.nextDouble();

        double descuento = precioTotal * 0.15;
        precioDescontado = precioTotal - descuento;

        System.out.println("Su precio despues del descuento es de: " + precioDescontado + "EUROS");
        System.out.println("Monto descontado: " + descuento + "EUROS");

        scan.close();
    }
}
