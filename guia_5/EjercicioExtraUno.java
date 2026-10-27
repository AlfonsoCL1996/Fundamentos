package guia_5;

import java.util.Scanner;

public class EjercicioExtraUno {
    public static void main(String[] args) {
        int n = 0;
        Scanner sc = new Scanner(System.in);
        while (n>=0) {
            System.out.println("Ingrese un numero: ");
            n = sc.nextInt();
            while (n != 0 && n > 0) {
                System.out.println("Ingrese un numero: ");
                n = sc.nextInt();
            }
        }
        sc.close();
    }    
}
