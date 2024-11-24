import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1, num2, resultado;
        int opcion;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce el primer número: ");
        num1 = sc.nextDouble();

        System.out.print("Introduce el segundo número: ");
        num2 = sc.nextDouble();

        do {
            System.out.println("""
                    ---Menú de opciones---
                    1- Sumar
                    2- Restar
                    3- Multiplicar
                    4- Dividir""");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
        }
        while ();
    }

    private static double calculadora(double num1, double num2, int opcion) {
        return 0.0;
    }
}