import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //En la variable longitud guardamos la longitud del lanzamiento en metros.
        double longitud;
        int result;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduzca la longitud en metros: ");
        longitud = sc.nextDouble();

        result = (int) (longitud * 100);

        System.out.println("El lanzamiento en el ranking es de " + result + " cm");
    }
}