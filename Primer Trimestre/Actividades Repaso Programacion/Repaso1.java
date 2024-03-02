import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso1 {
    public static void main(String[] args) {
        double a,b,resultado;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingresa un numero: ");
        a = sc.nextDouble();

        System.out.print("Ingresa otro numero: ");
        b = sc.nextDouble();

        resultado = a * b;

        System.out.println("El resultado de la multiplicación es " + resultado);

        sc.close();
    }
}