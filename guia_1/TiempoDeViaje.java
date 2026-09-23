package guia_1;
import java.util.Scanner;

public class TiempoDeViaje {
    public static void main(String[] args) {
        double distancia = 0.00;
        double velocidad = 0.00;
        double tiempo = 0.00;

        //tiempo = distancia / velocidad
        Scanner scan = new Scanner(System.in);
        System.out.print("Increse la distancia del recorrido en km: ");
        distancia = scan.nextDouble();
        System.out.print("Ingrese la velocidad promedio del viaje en km/h: ");
        velocidad = scan.nextDouble();

        tiempo = distancia/velocidad;
        System.out.println("Tardara una media de: " + tiempo + " Horas");
        scan.close();
    }
}
