package EjerciciosResueltos.Ejercicio7P1.MainPackage;
 
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P1 {
  public static void main(String[] args) {
    CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martin");
    cuenta.ingresarDinero(40);
    cuenta.sacarDinero(10);
    cuenta.mostrarInformacionCuenta();
  }
}
