import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radio, altura, volumen;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca el radio: ");
        radio = sc.nextDouble();

        System.out.print("Introduzca la altura: ");
        altura = sc.nextDouble();

        volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;

        System.out.printf("El volumen del cono es %.2f",volumen);
    }
}