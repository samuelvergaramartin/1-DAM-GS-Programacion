import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double temperaturas[] = new double[12];
        final String meses[] = {
                "Enero",
                "Febrero",
                "Marzo",
                "Abril",
                "Mayo",
                "Junio",
                "Julio",
                "Agosto",
                "Septiembre",
                "Octubre",
                "Noviembre",
                "Diciembre"
        };
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        for(int i = 0; i < temperaturas.length; i++) {
            System.out.print("Introduzca la temperatura del mes de " + meses[i] + ": ");
            temperaturas[i] = sc.nextDouble();
        }

        mostrarTemperaturas(temperaturas, meses);
    }

    private static void mostrarTemperaturas(double temperaturas[], final String meses[]) {
        for(int i = 0; i < temperaturas.length; i++) {
            System.out.print(meses[i] + ": ");
            for(int x = 1; x <= temperaturas[i]; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}