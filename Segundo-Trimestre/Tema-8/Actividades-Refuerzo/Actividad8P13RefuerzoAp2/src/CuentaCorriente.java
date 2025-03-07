public class CuentaCorriente {
    private final String NUMERO_CUENTA = generarNumeroCuenta();;
    private double saldo;

    public CuentaCorriente() {
        setSaldo(0);
    }

    public CuentaCorriente(int saldo) {
        setSaldo(saldo);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void ingreso(double cantidad) {
        if(cantidad < 0) System.out.println("La cantidad debe ser un numero positivo");
        else saldo+= cantidad;
    }

    public void cargo(double cantidad) {
        if(cantidad < 0) System.out.println("La cantidad debe ser un numero positivo");
        else saldo-= cantidad;
    }

    public void transferencia(CuentaCorriente otraCuenta, double cantidad) {
        if(cantidad < 0) System.out.println("La cantidad debe ser un numero positivo");
        else {
            saldo-= cantidad;
            otraCuenta.saldo+= cantidad;
        }
    }

    private String generarNumeroCuenta() {
        String resultado = String.valueOf((long) ((Math.random() * Long.parseLong("10000000000"))));

        while (resultado.length() < 10) {
            resultado = "0" + resultado;
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Número de cta: " + NUMERO_CUENTA + " Saldo: " + saldo + " €";
    }
}
