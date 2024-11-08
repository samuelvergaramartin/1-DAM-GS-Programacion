import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double cantidad, total = 0;
        Scanner sc = new Scanner(System.in);

        sc.useLocale(Locale.US);

        do {
            System.out.print("Introduzca una cantidad: ");
            cantidad = sc.nextDouble();

            if(cantidad < 0) System.out.println("Error: La cantidad debe ser positiva.");
            else if (cantidad > 0) total+= cantidad;
        }
        while (cantidad != 0);

        System.out.println("Tienes un total de " + total + " euros.");
    }
}