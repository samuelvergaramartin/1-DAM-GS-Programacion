import java.util.*;
/**
 * @author Samuel Vergara Martín 
 */
public class Repaso7 {
    public static void main(String[] args) {
        double importe, totalIVA, resultado;
        final double IVA = 0.05;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingresa el importe de la factura: ");
        importe = sc.nextDouble();

        totalIVA = importe * IVA;

        resultado = importe + totalIVA;

        System.out.println("Total a pagar: " + resultado);

        sc.close();
    }
}
