import java.util.Scanner;
import java.util.Locale;
public class Actividad1P11 {
    public static void main(String[] args) {
        double baseImponible, porcentajeIVA, importeIVA, total;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.println("Ingrese la base imponible: ");
        baseImponible = sc.nextDouble();

        System.out.println("Ingrese el porcentaje de IVA a aplicar: ");
        porcentajeIVA = sc.nextDouble();

        importeIVA = baseImponible * (porcentajeIVA / 100);

        System.out.println("El importe de IVA es: " + importeIVA);
    }
}