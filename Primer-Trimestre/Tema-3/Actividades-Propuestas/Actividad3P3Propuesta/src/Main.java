import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num, temp, temp2;
        int cifras = 1, carrito1;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        System.out.print("Introduce un número: ");
        num = sc.nextDouble();

        temp = num;

        //Mi idea con este bucle es primero obtener el número de cifras del número introducido
        do {
            temp/=10;
            cifras++;
        }
        while ((int) temp/10 != 0);

        temp = num;

        //Ahora , aquí mi idea aquí es poder desgranar ese número con el número de cifras obtenido para mostrarlo
        for (int i = cifras; i >= 1; i--) {
            carrito1 = (int) Math.pow(10, i-1);
            temp = num / carrito1;
            System.out.println((int) temp);
        }

        System.out.println("---------");

        temp = num;

        for (int i = cifras; i >= 1; i--) {
            carrito1 = (int) Math.pow(10, i-1);
            //System.out.println(carrito1);
            temp = num % carrito1;
            System.out.println((int) temp);
        }

        System.out.println("------------");

        temp = num;
        temp2 = num;

        for (int i = cifras; i >= 1; i--) {
            carrito1 = (int) Math.pow(10, i-1);
            //System.out.println(carrito1);
            temp = (num / carrito1) / 10;
            System.out.println((int) temp);
        }
    }
}