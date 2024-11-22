import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double radio, superficieRes, volumenRes;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduzca el radio: ");
        radio = sc.nextInt();

        superficieRes = superficie(radio);
        volumenRes = volumen(radio);

        System.out.println("Superficie: " + superficieRes);
        System.out.println("Volumen: " +  volumenRes);

    }

    private static double superficie(double radio) {
        return (4*Math.PI * Math.pow(radio, 2));
    }

    private static double volumen(double radio) {
        return (((4*Math.PI)/3)* Math.pow(radio, 3));
    }
}