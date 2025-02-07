public class CuentaCorriente {
    String dni;
    public String titular;
    private double saldo;
    static String banco = "BBVA";
    public Gestor gestor;

    public CuentaCorriente(String dni, double saldoInicial) {
        this.dni = dni;
        saldo = saldoInicial;
    }

    public CuentaCorriente(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
    }

    public CuentaCorriente(String dni, String titular, double saldoInicial) {
        this.dni = dni;
        this.titular = titular;
        saldo = saldoInicial;
    }

    public static String getBanco() {
        return banco;
    }

    public static void setBanco(String banco) {
        CuentaCorriente.banco = banco;
    }

    public void setGestor(Gestor gestor) {
        this.gestor = gestor;
    }

    public Gestor getGestor() {
        return this.gestor;
    }

    public void sacarDinero(double cantidad) {
        if(cantidad > saldo) System.out.println("Error: No puedes sacar más dinero del que hay");
        else saldo-= cantidad;
    }

    public void meterDinero(double cantidad) {
        if(cantidad <= 0) System.out.println("Error: La cantidad a introducir debe ser mayor a 0");
        else saldo+= cantidad;
    }

    public void mostrarInformacion() {
        System.out.println("Información de la cuenta");

        System.out.println("Titular: " + titular);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
        System.out.println("Banco: " + CuentaCorriente.banco);
    }
}
