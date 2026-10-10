/* Calculadora 
Mostrar menu con opciones: sumar, restar, multiplicar, dividir, salir
Pedir numeros, calcular y devolver resultado
*/

package guia_3;

import java.util.Scanner;

public class EjercicioSwitch {
    public static void main(String[] args) {
        int opcion;
        int a, b;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("CALCULADORA");
            System.out.println("(1) SUMAR: Pulsa 1 para sumar dos numeros.");
            System.out.println("(2) RESTAR: Pulsa 2 para restar dos numeros.");
            System.out.println("(3) MULTIPLICAR: Pulsa 3 para multiplicar dos numeros.");
            System.out.println("(4) DIVIDIR: Pulsa 4 para dividir dos numeros.");
            System.out.println("(0) SALIR: Pulsa 0 para salir.");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("SUMAR");
                    System.out.println("Ingrese un numero: ");
                    a = sc.nextInt();
                    System.out.println("Ingrese otro numero: ");
                    b = sc.nextInt();
                    int resultadoSumar = a + b;
                    System.out.println("La suma de " + a + " y " + b + " = " + resultadoSumar);
                    break;
                case 2:
                    System.out.println("RESTAR");
                    System.out.println("Ingrese un numero: ");
                    a = sc.nextInt();
                    System.out.println("Ingrese otro numero: ");
                    b = sc.nextInt();
                    int resultadoRestar = a - b;
                    System.out.println("La resta de " + a + " y " + b + " = " + resultadoRestar);
                    break;
                case 3:
                    System.out.println("MULTIPLICAR");
                    System.out.println("Ingrese un numero: ");
                    a = sc.nextInt();
                    System.out.println("Ingrese otro numero: ");
                    b = sc.nextInt();
                    int resultadoMultiplicar = a * b;
                    System.out.println("La multiplicacion de " + a + " y " + b + " = " + resultadoMultiplicar);
                    break;
                case 4:
                    System.out.println("DIVIDIR");
                    System.out.println("Ingrese un numero: ");
                    a = sc.nextInt();
                    System.out.println("Ingrese otro numero: ");
                    b = sc.nextInt();
                    if (b != 0) {
                        int resultadoDividir = a / b;
                        System.out.println("La division de " + a + " y " + b + " = " + resultadoDividir);
                    } else {
                        System.out.println("ERROR: IMPOSIBLE DIVIDIR ENTRE 0");
                    }
                    break;
                case 0:
                    System.out.println("Adios. Vuelva pronto a su calculadora favorita en terminal!");
                    break;
                default:
                    System.out.println("ERROR. Opcion invalida.");
            }
        } while (opcion != 0);
        sc.close();
    }
}
