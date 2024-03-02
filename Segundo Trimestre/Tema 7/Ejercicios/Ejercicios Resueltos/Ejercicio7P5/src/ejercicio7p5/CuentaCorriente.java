package ejercicio7p5;

/**
 *
 * @author Samuel Vergara Martín
 */
public class CuentaCorriente {
    String dni;
    int saldo;
    String titular;
    private String banco;
    public Gestor gestor = new Gestor();
    
    CuentaCorriente(String dni, int saldo, String titular) {
        this.dni = dni;
        this.saldo = saldo;
        this.titular = titular;
    }
    
    void setBanco(String banco) {
        this.banco = banco;
    }
    String getBanco() {
        return "Nombre del banco: " +  banco;
    }
}
