import java.util.*;
/**
 * @author Samuel Vergara Martin
 */
public class Repaso2 {
    public static void main(String[] args) {
        double euros,conversion;
        final double valorde1EuroEnPesetas = 166.386;
        String msgResultado;
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Ingrese la cantidad en euros: ");
        euros = sc.nextDouble();

        conversion = euros * valorde1EuroEnPesetas;

        msgResultado = euros <= 0 ? "ERROR: La cantidad introducida debe ser mayor a 0" : euros + " euros son " + conversion + " pesetas";

        System.out.println(msgResultado);

        sc.close();
    }
}
