import java.util.*;
/**
 * @author Samuel Vergara Martín
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        double a,b,x;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce el valor a: ");
        a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();

        x = -b / a;

        System.out.printf("El valor de x es: %.2f", x);

        sc.close();

        System.exit(0);
    }
}
