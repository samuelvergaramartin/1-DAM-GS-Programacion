import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double x1, y1, x2, y2, valorDistancia;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        x1 = pedirValor("x1", sc);
        y1 = pedirValor("y1", sc);
        x2 = pedirValor("x2", sc);
        y2 = pedirValor("y2", sc);

        valorDistancia = distancia(x1, y1, x2, y2);

        System.out.println("La distancia es: " + valorDistancia);
    }

    private static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt((Math.pow((x1-x2),2) + Math.pow((y1-y2), 2)));
    }

    private static double pedirValor(String valor, Scanner sc) {
        System.out.print("Introduzca el valor de " + valor + ": ");
        return sc.nextDouble();
    }
}