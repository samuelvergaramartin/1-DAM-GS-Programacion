import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Variables los valores de a, b y c , y  las x de la ecuación
        double a, b, c, x1, x2;
        //Resto de variables
        Scanner sc = new Scanner(System.in);

        //Teclado en ingles
        sc.useLocale(Locale.US);

        //Pedimos los valores de a, b y c al usuario
        System.out.print("Introduce el valor de a: ");
        a = sc.nextDouble();

        System.out.print("Introduce el valor de b: ");
        b = sc.nextDouble();

        System.out.print("Introduce el valor de c: ");
        c = sc.nextDouble();

        //Evitamos que se produzca una division por 0, comprobamos valor de a
        if(a == 0) System.out.println("No se puede resolver la ecuación, a no puede ser 0");
        else {
            //Calculamos las X siguiendo la ecuacion
            x1 = (-b + Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;
            x2 = (-b - Math.sqrt((Math.pow(b, 2) - 4 * a * c))) / 2 * a;

            System.out.println("El valor de x1 es " + x1);
            System.out.println("El valor de x2 es " + x2);
        }
    }
}