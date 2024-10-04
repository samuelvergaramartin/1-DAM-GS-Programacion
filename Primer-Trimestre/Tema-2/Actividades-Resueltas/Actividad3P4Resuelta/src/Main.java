import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce un numero: ");
        num = sc.nextDouble();

        if(num == 0) System.out.println("El numero no es casi-cero");
        else if (num < 0 && num > -1 || num > 0 && num < 1) System.out.println("El numero es casi-cero");
        else System.out.println("El numero no es casi-cero");
    }
}