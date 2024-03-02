/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadApp2P15 {
    public static void main(String[] args) {
        double base, altura, area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        
        System.out.print("Introce la base: ");
        base = sc.nextDouble();
        System.out.print("Introce la altura: ");
        altura = sc.nextDouble();
        
        if (base > 0 && altura > 0) {
            area = base * altura / 2.0;
            System.out.printf("El area del triangulo de base %.2f y altura %.2f es de %.2f metros cuadrados", base, altura, area);
        } else {
            System.out.println("Introduce una base y altura mayor que 0");
        } 
        sc.close();
        System.exit(0);
    }
}
