import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int aforoMax, numEntradas;
        double precioPorEntrada, dineroRecaudado;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce el aforo máximo: ");
        aforoMax = sc.nextInt();

        System.out.print("Introduce el precio por entrada: ");
        precioPorEntrada = sc.nextDouble();

        System.out.print("Introduce el número de entradas vendidas: ");
        numEntradas = sc.nextInt();

        if(numEntradas > aforoMax*0.2) {
            if(numEntradas < aforoMax*0.5) precioPorEntrada *= 0.75;

            dineroRecaudado = precioPorEntrada * numEntradas;

            System.out.println("El total recaudado es: " +  dineroRecaudado + " euros.");
        }
        else System.out.println("El concierto se ha cancelado.");
    }
}