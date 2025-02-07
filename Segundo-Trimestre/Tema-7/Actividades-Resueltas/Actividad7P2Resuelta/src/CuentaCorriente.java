class CuentaCorriente {
    String dni;
    String titular;
    double saldo;

    CuentaCorriente(String dni, double saldoInicial) {
        this.dni = dni;
        saldo = saldoInicial;
    }

    CuentaCorriente(String dni, String titular) {
        this.dni = dni;
        this.titular = titular;
    }

    CuentaCorriente(String dni, String titular, double saldoInicial) {
        this.dni = dni;
        this.titular = titular;
        saldo = saldoInicial;
    }

    void sacarDinero(double cantidad) {
        if(cantidad > saldo) System.out.println("Error: No puedes sacar más dinero del que hay");
        else saldo-= cantidad;
    }

    void meterDinero(double cantidad) {
        if(cantidad <= 0) System.out.println("Error: La cantidad a introducir debe ser mayor a 0");
        else saldo+= cantidad;
    }

    void mostrarInformacion() {
        System.out.println("Información de la cuenta");

        System.out.println("Titular: " + titular);
        System.out.println("DNI: " + dni);
        System.out.println("Saldo: " + saldo);
    }
}
