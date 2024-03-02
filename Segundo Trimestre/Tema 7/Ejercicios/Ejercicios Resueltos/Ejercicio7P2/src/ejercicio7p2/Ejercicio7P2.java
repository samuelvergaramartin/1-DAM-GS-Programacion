package ejercicio7p2;
import netcat_utils.Colors;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta1 = new CuentaCorriente("77426564P", "Samuel Vergara Martín", 100);
        cuenta1.mostrarInformacionCuenta();
        CuentaCorriente cuenta2 = new CuentaCorriente("77426564P", 400);
        cuenta2.nombreTitular = "Samuel";
        System.out.println(Colors.GREEN + "-----------------------------" + Colors.RESET);
        cuenta2.mostrarInformacionCuenta();
    }
    
}
