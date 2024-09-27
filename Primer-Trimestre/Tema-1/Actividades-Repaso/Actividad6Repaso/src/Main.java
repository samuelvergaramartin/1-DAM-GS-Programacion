import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la base: ");
        base = sc.nextDouble();

        System.out.print("Introduce la altura: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2.0;

        System.out.println("El area del triangulo es " +  area);
    }
}