import java.util.*;
/**
 * @author Samuel Vergara Martin
 */
public class Repaso3 {
    public static void main(String[] args) {
        double pesetas,conversion;
        final double valorde1PesetaEnEuros = 0.00601012;
        String msgResultado;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese la cantidad en pesetas: ");
        pesetas = sc.nextDouble();

        conversion = pesetas * valorde1PesetaEnEuros;

        msgResultado = pesetas <= 0 ? "ERROR: La cantidad introducida debe ser mayor a 0" : pesetas + " pesetas son " + conversion + " euros";

        System.out.println(msgResultado);

        sc.close();
    }
}
