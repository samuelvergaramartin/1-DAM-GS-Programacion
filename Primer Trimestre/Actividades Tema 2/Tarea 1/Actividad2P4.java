/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
 public class Actividad2P4 {
    public static void main(String[] args) {
       double num1;
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.US);

       System.out.print("Introduce un numero decimal: ");
       num1 = sc.nextDouble();

       if(num1 < 1 && num1 > 0 || num1 > -1 && num1 < 0) {
        System.out.println("Es un numero casi-cero");
       }
       else {
        System.out.println("No es un numero casi-cero");
       }
       sc.close();

       System.exit(0);
    }
 }
