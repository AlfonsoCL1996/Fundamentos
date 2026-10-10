/* El negocio de desinfectantes, antes mencionado, vende detergente suelto, y los precios se aplican según la siguiente escala:

**a.** 25 ARS por litro, los primeros 50 litros.

**b.** 20 ARS por litro, si la venta es de 101 a 200 litros.

**c.** 15 ARS por litro, si la venta es de 201 a 500 litros.

**d.** 10 ARS por litro, si la venta es de más de 500 litros.

Además, si se paga en efectivo, tiene un descuento adicional del 10% sobre el importe final.

Hacer un programa que solicite la cantidad de litros vendidos y el tipo de pago (ingresará 1 si paga en efectivo, 
y 0 con cualquier otro medio de pago); calcular y emitir por pantalla el monto final a abonar por el cliente. */

package guia_3;

import java.util.Scanner;

public class ejercicioOcho {
    public static void main(String[] args) {

        double pagoFinal = 0;
        double precioDescuento;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad total de litros servidos: ");
        double litrosServidos = sc.nextDouble();

        if (litrosServidos > 500) {
            pagoFinal = litrosServidos * 10;
        }
        if (litrosServidos >200 && litrosServidos <=500) {
            pagoFinal = litrosServidos * 15;
        }
        if (litrosServidos >100 && litrosServidos <=200) {
            pagoFinal = litrosServidos * 20;
        }
        if (litrosServidos <=50) {
            pagoFinal = litrosServidos * 25;
        }

        System.out.println("Pago en efectivo: Pulse 1");
        System.out.println("Pago con otro medio: Pulse 0");
        int tipoPago = sc.nextInt();
        if (tipoPago == 1) {
            double descuento = pagoFinal * 0.1;
            precioDescuento = pagoFinal - descuento;
            pagoFinal = precioDescuento;
        }

        System.out.println("Su precio final es: " + pagoFinal + " ARS");
        sc.close();
    }
}
