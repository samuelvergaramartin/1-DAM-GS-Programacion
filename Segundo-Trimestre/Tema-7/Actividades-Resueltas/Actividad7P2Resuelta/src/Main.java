public class Main {
    public static void main(String[] args) {
        CuentaCorriente c1 = new CuentaCorriente("77426564P", "Samuel"),
        c2 = new CuentaCorriente("77426564P", "Samuel", 60);

        System.out.println("Cuenta 1:");
        c1.mostrarInformacion();

        System.out.println("Cuenta 2:");
        c2.mostrarInformacion();
    }
}