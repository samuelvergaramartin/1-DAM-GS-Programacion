import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double longitud,area,radio;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduzca el radio de la circunferencia: ");
        radio = sc.nextDouble();

        longitud = 2.0 * Math.PI * radio;
        area = Math.PI * Math.pow(radio, 2);

        System.out.printf("Longitud: %.2f", longitud);
        System.out.printf("\nArea: %.2f", area);
    }
}