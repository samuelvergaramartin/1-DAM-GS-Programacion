import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num, total = 0;
        double media = 0.0;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        for (int i = 1; i<= 10; i++) {
            System.out.print("Introduzca un número: ");
            num = sc.nextInt();

            total += num;


        }

        media = total / 10.0;

        System.out.println("La media es: " + media);
    }
}