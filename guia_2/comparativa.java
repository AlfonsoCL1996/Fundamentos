/* Hacer un programa para ingresar dos números distintos y luego se muestre por pantalla el menor de ellos. */

package guia_2;
import java.util.Scanner;
public class comparativa {
    public static void main(String[] args) {
        int numA, numB;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero entero: ");
        numA = sc.nextInt();
        System.out.println("Ingrese otro numero entero: ");
        numB = sc.nextInt();
        if (numA < numB) {
            System.out.println(numA);
        } else if (numB < numA) {
            System.out.println(numB);
        } else {
            System.out.println("ERROR, los numeros son iguales");
        }
        sc.close();
    }
}
