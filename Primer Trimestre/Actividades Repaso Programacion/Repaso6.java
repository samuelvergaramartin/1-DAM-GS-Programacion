import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso6 {
   public static void main(String[] args) {
        double base,altura,area;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese la base del triangulo: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura del triangulo: ");
        altura = sc.nextDouble();

        area = (base * altura) / 2;

        System.out.println("El area del triangulo es: " + area);

        sc.close();
   } 
}
