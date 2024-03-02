import java.util.Scanner;
import java.util.Locale;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P15 {
    public static void main(String[] args) {
        double a,b,c,x,y;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();

        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();

        System.out.print("Ingrese el valor de x: ");
        x = sc.nextDouble();

        y = a * Math.pow(x, 2) + b * x + c;

        System.out.println("El valor de Y es: " + y);

        sc.close();
    }
}
