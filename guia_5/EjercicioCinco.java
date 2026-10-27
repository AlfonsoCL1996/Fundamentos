/* Hacer un programa que muestre los números del 1 al 100 de 5 en 5. 
Ejemplo: 0, 5, 10, 15, 20… 100. 
Usando While. */

package guia_5;

public class EjercicioCinco {
    public static void main(String[] args) {
        int contador = 0;
        while (contador <=100) {
            System.out.println(contador);
            contador += 5;
        }
    }
}
