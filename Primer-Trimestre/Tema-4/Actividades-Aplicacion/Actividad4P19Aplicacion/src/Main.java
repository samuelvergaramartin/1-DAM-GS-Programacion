import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cantidad, max, min;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce el número de numeros aleatorios a generar: ");
        cantidad = sc.nextDouble();

        System.out.print("Introduce el rango minimo: ");
        min = sc.nextDouble();

        System.out.print("Introduce el rango maximo: ");
        max = sc.nextDouble();

        aleatorio(cantidad, max, min);
    }

    private static void aleatorio(int cantidad, int max, int min) {
        int num;
        for(int i = 1; i <= cantidad; i++) {
            num = (int)((Math.random() * max) + min);
            System.out.println(num);
        }
    }

    private static void aleatorio(double cantidad, double max, double min) {
        double num;
        for(int i = 1; i <= cantidad; i++) {
            num = ((Math.random() * max) + min);
            System.out.println(num);
        }
    }
}