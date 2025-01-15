import java.util.Scanner;
import static java.util.Locale.US;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        double sueldos[] = new double[0], sueldo;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(US);

        System.out.print("Introduce tu sueldo: ");
        sueldo = sc.nextDouble();

        while (sueldo > 0) {
            sueldos =
        }
    }

    private static void ordenarDecrecientemente(double t[]) {
        double aux[] = new double[t.length];

        for(int i = 0; i < t.length; i++) {
            aux[i] = t[i];
            t[i] = 0;
        }

        for(int i = t.length - 1, x = 0; i >= 0 && x < t.length; i-- , x++) {
            t[x] = aux[i];
        }
    }
}