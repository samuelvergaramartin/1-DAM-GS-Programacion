/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadAplicacion4P12 {
    public static void main(String[] args) {
        double x1,x2,y1,y2;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce el valor de x1: ");
        x1 = sc.nextDouble();

        System.out.print("Introduce el valor de x2: ");
        x2 = sc.nextDouble();

        System.out.print("Introduce el valor de y1: ");
        y1 = sc.nextDouble();

        System.out.print("Introduce el valor de y2: ");
        y2 = sc.nextDouble();

        sc.close();

        double resultado = distancia(x1, y1, x2, y2);

        System.out.println(resultado);
    }
    static double distancia(double x1, double y1, double x2, double y2) {
        double resultado;
        resultado = Math.sqrt((Math.pow((x1-x2), 2) + Math.pow((y1-y2), 2)));
        return resultado;
    }
}
