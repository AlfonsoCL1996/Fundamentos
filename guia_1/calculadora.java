package guia_1;
import java.util.Scanner;       //Clase Scanner para recoger datos desde teclado

public class calculadora {
    public static void main(String[] args) {

        System.out.println("---Calculadora que solo SUMA---");
        //Variables
        int a, b, c;

        Scanner scan = new Scanner(System.in);      //Instancia de clase Scanner
        
        //Pedir un numero: salida por terminal + entrada de datos
        System.out.println("Ingrese un numero: ");
        a = scan.nextInt();
        System.out.println("Ingrese otro numero: ");
        b = scan.nextInt();
        scan.close();

        c=a+b;
        System.out.println("La suma es: " + c);
    }
}