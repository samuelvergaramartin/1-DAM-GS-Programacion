import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;
        int result;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Escriba un numero decimal: ");
        num = sc.nextDouble();

        result = (int) (num + 0.5);

        System.out.println(result);
    }
}