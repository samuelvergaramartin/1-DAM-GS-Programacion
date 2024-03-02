package EjerciciosResueltos.Ejercicio7P3.MainPackage;
 
public class Ejercicio7P3 {
  public static void main(String[] args) {
    CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martin");
    cuenta.ingresarDinero(500);
    cuenta.mostrarInformacionCuenta();
  }
}
