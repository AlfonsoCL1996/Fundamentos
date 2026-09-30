/*Un importante negocio de desinfectantes líquidos, realiza descuentos dependiendo de la cantidad de litros vendidos, 
según la siguiente escala:

**a.** Si vende menos de 100 litros, no hay descuento.

**b.** Si vende entre 101 y 300 litros, el descuento es del 10%.

**c.** Si vende entre 301 y 500 litros, el descuento es del 15%.

**d.** Finalmente, si la venta es de más de 500 litros, el descuento es del 25%.

Hacer un programa que solicite el ingreso del importe total de la venta 
y la cantidad de litros vendidos. 
Calcular y emitir el importe con el descuento aplicado. */

package guia_3;

import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {
        double descuento, precioFinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Importe total de la venta: ");
        double precioVenta = sc.nextDouble();
        System.out.println("Cantidad de litros totales servidos: ");
        double cantidadLitros = sc.nextDouble();
        sc.close();

        if (cantidadLitros < 100){
            System.out.println("Se ha servido " + cantidadLitros + ".\nNo aplica descuento");
        } else if (cantidadLitros <= 300) {
            descuento = precioVenta * 0.1;
            precioFinal = precioVenta - descuento;
            System.out.println("Con su compra de " + precioVenta + " se le aplica un 10% de descuento. \nTotal a pagar = " + precioFinal + " EUR");
        } else if (cantidadLitros <= 500) {
            descuento = precioVenta * 0.15;
            precioFinal = precioVenta - descuento;
            System.out.println("Con su compra de " + precioVenta + " se le aplica un 15% de descuento. \nTotal a pagar = " + precioFinal + " EUR");
        } else {
            descuento = precioVenta * 0.25;
            precioFinal = precioVenta - descuento;
            System.out.println("Con su compra de " + precioVenta + " se le aplica un 25% de descuento. \nTotal a pagar = " + precioFinal + " EUR");
        }
    }
}
