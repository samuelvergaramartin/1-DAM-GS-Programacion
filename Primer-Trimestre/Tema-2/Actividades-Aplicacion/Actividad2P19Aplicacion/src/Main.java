import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double grados, radianes;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca los grados: ");
        grados = sc.nextDouble();

        if(grados > 360) grados %= 360;

        radianes = (Math.PI / 180.0) * grados;

        System.out.println(radianes);
    }
}