import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso5 {
    public static void main(String[] args) {
        double ancho,largo,area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce el ancho del rectangulo: ");
        ancho = sc.nextDouble();

        System.out.print("Introduce el largo del rectangulo: ");
        largo = sc.nextDouble();

        area = ancho * largo;

        System.out.println("El area del rectangulo es: " + area);

        sc.close();
    }
}
