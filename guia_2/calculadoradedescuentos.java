/* Una casa de video juegos otorga un descuento dependiendo del importe de la compra realizada según los siguientes valores:
• Si el importe es menor a EUR 1000, no hay descuento.
• Si el importe es EUR 1000 o más pero menor a ARS 5000, aplica un descuento del 10%.
• Si el importe es EUR 5000 o más, aplica un descuento del 18%.

Hacer un programa para ingresar un importe de venta y luego muestre por pantalla el importe final con el descuento que corresponda. */


package guia_2;

import java.util.Scanner;

public class calculadoradedescuentos {
    public static void main(String[] args) {

        double descuento;

        Scanner sc = new Scanner(System.in);
        System.out.println("Importe de la venta actual en EUROS: ");
        double venta = sc.nextDouble();
        sc.close();

        if (venta >= 1000 && venta < 5000) {
            descuento = venta * 0.1;
            System.out.println("Precio final aplicando descuento de 10% " + (venta - descuento));
        } else if (venta >= 5000) {
            descuento = venta * 0.18;
            System.out.println("Precio final aplicando descuento del 18% " + (venta - descuento));
        } else if (venta < 1000) {
            System.out.println("No aplica descuento: Importe menor a 1000 EUR");
        } else {
            System.out.println("ERROR INESPERADO");
        }
    }
}
