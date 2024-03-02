/**
 * @author Samuel Vergara Martín
 */
import java.util.*;

public class Actividad2P8 {
    public static void main(String[] args) {
        double a,b,c,x1,x2,contenidoRaiz;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el valor de b: ");
        b = sc.nextDouble();
        
        System.out.print("Ingrese el valor de c: ");
        c = sc.nextDouble();

        contenidoRaiz = (Math.pow(b, 2) - 4 * a * c);

      
        if( contenidoRaiz >= 0) {
              if(a == 0) {
                System.out.println("No se puede resolver porque a es igual a 0");
              }
              else {
                x1 = (-b +(Math.sqrt((Math.pow(b, 2) - 4 * a * c)))) / (2 * a);
                System.out.println("X1 es igual a " + x1);
                x2 = (-b -(Math.sqrt((Math.pow(b, 2) - 4 * a * c)))) / (2 * a);
                System.out.println("X2 es igual a " + x2);
              }
        }
        else {
            System.out.println("ERROR: No existe una raiz de un numero negativo");
        }

        sc.close();
    }
}