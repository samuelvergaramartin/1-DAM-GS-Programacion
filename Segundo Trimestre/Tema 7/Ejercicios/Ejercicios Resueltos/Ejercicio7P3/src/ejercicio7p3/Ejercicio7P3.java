package ejercicio7p3;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martin");
        cuenta.ingresarDinero(500);
        cuenta.mostrarInformacionCuenta();
    }
    
}
