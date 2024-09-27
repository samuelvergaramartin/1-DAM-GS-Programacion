import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mb, kb;
        //En la constante conversor indicamos cuantos KB son 1 MB;
        final int conversor = 8000;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la cantidad en MB: ");
        mb = sc.nextDouble();

        kb = mb * conversor;

        System.out.println(mb + " MB son " +  kb + " KB");
    }
}