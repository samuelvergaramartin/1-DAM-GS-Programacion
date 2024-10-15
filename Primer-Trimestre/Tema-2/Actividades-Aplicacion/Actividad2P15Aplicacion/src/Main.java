import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca la base: ");
        base = sc.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = sc.nextDouble();

        if(base > 0 && altura > 0) {
            area = (base * altura) / 2.0;
            System.out.printf("Área del triangulo: %.2f", area);
        }
        else System.out.println("Error: Las medidas deben ser numeros positivos mayores que 0");


    }
}