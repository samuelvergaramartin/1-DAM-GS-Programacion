package ejercicio2;
import java.util.Scanner;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int alturaKilometros;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce la altura (km): ");
        alturaKilometros = sc.nextInt();

        mostrarGravedad(alturaKilometros);
    }
    
    private static void mostrarGravedad(int altura) {
        final int radio = 6370000;
        int alturaMetros;
        double gravedad;

        System.out.println("Altitud (km)                Gravedad(m/s2)");
        System.out.println("____________                ______________");

        for (int i = 0; i <= altura; i+=100) {
            alturaMetros = i*1000;

            System.out.print(i + "                           ");

            gravedad = 9.8 * ((Math.pow(radio,2))/(Math.pow(radio + alturaMetros, 2)));

            System.out.printf("%.2f \n", gravedad);
        }
    }
    
}
