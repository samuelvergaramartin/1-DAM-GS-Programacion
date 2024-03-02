import java.util.Scanner;
import java.util.Locale;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P11 {
    public static void main(String[] args) {
        double porcentajeIva, baseImponible, totalIVA, total;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el porcentaje de IVA: ");
        porcentajeIva = sc.nextDouble();

        System.out.print("Ingrese la base imponible: ");
        baseImponible = sc.nextDouble();

        totalIVA = baseImponible * (porcentajeIva / 100);

        total = baseImponible + totalIVA;

        System.out.println("Total IVA: " + totalIVA + "\nTotal importe: " + total);

        sc.close();
    }
}