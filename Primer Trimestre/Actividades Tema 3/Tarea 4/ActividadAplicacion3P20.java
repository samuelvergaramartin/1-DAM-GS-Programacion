/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadAplicacion3P20 {
    public static void main(String[] args) {
        double cantidad,total = 0;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introduce una cantidad: ");
        cantidad = sc.nextDouble();
        total+=cantidad;

        while(cantidad != 0) {
            System.out.print("Introduce una cantidad: ");
            cantidad = sc.nextDouble();
            total+=cantidad;
        }
        sc.close();
        System.out.println("En total tienes: " + total);
        System.exit(0);
    }
}
