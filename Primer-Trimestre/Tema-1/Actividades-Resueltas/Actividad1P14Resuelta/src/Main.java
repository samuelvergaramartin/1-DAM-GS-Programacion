import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Escriba un numero decimal: ");
        num = sc.nextDouble();

        System.out.println(Math.round(num));
    }
}