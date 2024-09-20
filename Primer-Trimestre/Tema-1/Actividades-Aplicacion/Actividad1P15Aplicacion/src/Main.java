import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c,x,y;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Introduzca el valor de b: ");
        b = sc.nextDouble();

        System.out.print("Introduzca el valor de c: ");
        c = sc.nextDouble();

        System.out.print("Introduzca el valor de x: ");
        x = sc.nextDouble();

        y = (a * Math.pow(x, 2)) + (b*x) + c;

        System.out.println("El valor de Y es: " + y);
    }
}