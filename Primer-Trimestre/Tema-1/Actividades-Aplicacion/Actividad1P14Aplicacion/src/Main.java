import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, areaTriangulo;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la base del triángulo: ");
        base = sc.nextDouble();

        System.out.print("Introduzca la altura del triángulo: ");
        altura = sc.nextDouble();

        areaTriangulo = (base * altura) / 2.0;

        System.out.printf("El área del triangulo es: %.2f", areaTriangulo);
    }
}