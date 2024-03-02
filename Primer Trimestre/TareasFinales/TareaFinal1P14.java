import java.util.Scanner;
import java.util.Locale;
/*
 * @author Samuel Vergara Martín
 */
public class TareaFinal1P14 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce la base: ");
        base = sc.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area es: " + area);

        sc.close();
    }
}
