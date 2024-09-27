import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double euros, pesetas;
        //En la constante conversión se almacena cuantas pesetas son un euro
        final double conversion = 166;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce la cantidad en pesetas: ");
        pesetas = sc.nextDouble();

        euros = pesetas / conversion;

        System.out.println(pesetas + " pesetas son " + euros + " euros.");
    }
}