import java.text.DecimalFormat;

public class TarjetaRegalo {
    final private String NUMERO;
    private double saldo;
    DecimalFormat t = new DecimalFormat();

    public TarjetaRegalo(double saldo) {
        String num = String.valueOf((int) ((Math.random() * 100000)));

        while (num.length() < 5) {
            num = "0" + num;
        }

        NUMERO = num;

        setSaldo(saldo);
    }

    public String getNUMERO() {
        return NUMERO;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if(saldo < 0) System.out.println("Error: El saldo debe ser igual o mayor que 0.");
        else this.saldo = saldo;
    }

    public void gasta(double cantidad) {
        if(cantidad > saldo) System.out.println("No tiene suficiente saldo para gastar " + cantidad + "€");
        else {
            saldo-= cantidad;
        }
    }

    public TarjetaRegalo fusionaCon(TarjetaRegalo otraTarjeta) {
        TarjetaRegalo resultado = new TarjetaRegalo(saldo + otraTarjeta.saldo);
        saldo = 0;
        otraTarjeta.saldo = 0;

        return resultado;
    }

    private String obtenerSaldoFormateado() {
        final String saldo = String.valueOf(this.saldo);
        String entero = "", decimal = "", resultado = "";
        int i = 0;

        while (i < saldo.length() && saldo.charAt(i) != '.') {
            entero+= saldo.charAt(i);
            i++;
        }
        i++;
        while (i < saldo.length()) {
            decimal+= saldo.charAt(i);
            i++;
        }

        resultado+= entero + ".";

        switch (decimal.length()) {
            case 1: {
                resultado+= decimal + "0";
                break;
            }
            case 2: {
                resultado+= decimal;
                break;
            }
            default: {
                resultado+= decimal.substring(0, 1);
                break;
            }
        }

        return resultado;
    }

    @Override
    public String toString() {
        return "Tarjeta nº " + NUMERO + " - Saldo " + obtenerSaldoFormateado() + "€";
    }
}
