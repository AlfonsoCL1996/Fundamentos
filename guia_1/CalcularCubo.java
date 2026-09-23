package guia_1;
import java.util.Scanner;

public class CalcularCubo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, cuadrado=0, cubo=1;
        System.out.println("Escriba el numero para calcular su cubo: ");
        numero = scan.nextInt();

        for (int i=0; i<3; i++) {
            cubo = cubo * numero;
        }

        /*cuadrado = numero * numero;
        cubo = cuadrado * numero;*/

        System.out.println("El cubo es: " + cubo);
        scan.close();
    }
}