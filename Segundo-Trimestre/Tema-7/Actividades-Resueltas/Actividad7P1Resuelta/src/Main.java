public class Main {
    public static void main(String[] args) {
        CuentaCorriente cuenta = new CuentaCorriente("77426564P", "Samuel Vergara Martín");

        cuenta.mostrarInformacion();

        cuenta.meterDinero(10);

        System.out.println(cuenta.saldo);

        cuenta.sacarDinero(1);

        System.out.println(cuenta.saldo);
    }
}