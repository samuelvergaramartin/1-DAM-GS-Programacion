import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, IVA, total;
        final double porcentajeIva = 0.21;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la base imponible: ");
        base = sc.nextDouble();

        IVA = base * 0.21;

        total = base * (1 + porcentajeIva);

        System.out.println("Base: " + base);
        System.out.printf("IVA: %.2f", IVA);
        System.out.printf("\nTotal: %.2f", total);
    }
}