package ejercicio7p1;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martin");
        cuenta.ingresarDinero(40);
        cuenta.sacarDinero(10);
        cuenta.mostrarInformacionCuenta();
    }
    
}
