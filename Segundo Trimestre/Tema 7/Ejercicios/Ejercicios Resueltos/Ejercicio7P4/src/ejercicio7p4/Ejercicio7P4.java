package ejercicio7p4;
import netcat_utils.Colors;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombreBanco;
        CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martin");
        
        cuenta.ingresarDinero(600);
        cuenta.setBanco("NetCat Bank");
        nombreBanco = cuenta.getBanco();
        
        System.out.println(Colors.CYAN + "Nombre de la cuenta del banco: " + nombreBanco + Colors.RESET);
        System.out.println(Colors.GREEN + "--------------------------------" + Colors.RESET);
        cuenta.mostrarInformacionCuenta();
    }
    
}
