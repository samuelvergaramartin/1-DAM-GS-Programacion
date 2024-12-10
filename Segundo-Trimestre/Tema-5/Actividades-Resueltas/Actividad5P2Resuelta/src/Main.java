import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numeros[] = new double[5];
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        for(int i = 0; i < numeros.length; i++) {
            System.out.print("Introduce un número: ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("Mostrando números...");

        for(double e : numeros) {
            System.out.println(e);
        }
    }
}