public class Main {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("1234", "Pepe", 50),
        c2 = new CuentaCorriente("5678", "Pedro", 70);

        c.mostrarInformacion();
        c2.mostrarInformacion();

        CuentaCorriente.setBanco("Santander");

        c.mostrarInformacion();
        c2.mostrarInformacion();
    }
}