import dinero.Billete;
import dinero.Moneda;

public class Main {
    public static void main(String[] args) {
        Cambio cambio = new Cambio(1000, 9999);
        Object vuelta[];
        String resultado;

        vuelta = cambio.obtenerDineroCambio();
        resultado = obtenerResultado(vuelta);

        System.out.println(resultado);
    }

    private static String obtenerResultado(Object vuelta[]) {
        String resultado = "";
        int b500 = 0, b200 = 0, b100 = 0, b50 = 0, b20 = 0, b10 = 0, b5 = 0,
        m2E = 0, m1E = 0, m50C = 0, m20C = 0, m10C = 0, m5C = 0, m2C = 0, m1C = 0;

        if(vuelta != null) {
            for(Object obj : vuelta) {
                if(obj.getClass().getSimpleName().equals("Moneda")) {
                    switch (((Moneda) obj).getTipo()) {
                        case DOS_EUROS -> {
                            m2E++;
                        }
                        case UN_EURO -> {
                            m1E++;
                        }
                        case CINCUENTA_CENTIMOS -> {
                            m50C++;
                        }
                        case VEINTE_CENTIMOS -> {
                            m20C++;
                        }
                        case DIEZ_CENTIMOS -> {
                            m10C++;
                        }
                        case CINCO_CENTIMOS -> {
                            m5C++;
                        }
                        case DOS_CENTIMOS -> {
                            m2C++;
                        }
                        case UN_CENTIMO -> {
                            m1C++;
                        }
                    }
                }
                else {
                    switch (((Billete) obj).getTipo()) {
                        case QUINIENTOS_EUROS -> b500++;
                        case DOSCIENTOS_EUROS -> b200++;
                        case CIEN_EUROS -> b100++;
                        case CINCUENTA_EUROS -> b50++;
                        case VEINTE_EUROS -> b20++;
                        case DIEZ_EUROS -> b10++;
                        case CINCO_EUROS -> b5++;
                    }
                }
            }

            resultado+= "Cambio:\n";

            resultado+= "Billetes de 500 €: " + b500 + "\n";
            resultado+= "Billetes de 200 €: " + b200 + "\n";
            resultado+= "Billetes de 100 €: " + b100 + "\n";
            resultado+= "Billetes de 50 €: " + b50 + "\n";
            resultado+= "Billetes de 20 €: " + b20 + "\n";
            resultado+= "Billetes de 10 €: " + b10 + "\n";
            resultado+= "Billetes de 5 €: " + b5 + "\n";

            resultado+= "Monedas de 2 €: " + m2E + "\n";
            resultado+= "Monedas de 1 €: " + m1E + "\n";
            resultado+= "Monedas de 50 céntimos: " + m50C + "\n";
            resultado+= "Monedas de 20 céntimos: " + m20C + "\n";
            resultado+= "Monedas de 10 céntimos: " + m10C + "\n";
            resultado+= "Monedas de 5 céntimos: " + m5C + "\n";
            resultado+= "Monedas de 2 céntimos: " + m2C + "\n";
            resultado+= "Monedas de 1 céntimo: " + m1C + "\n";
        }

        return resultado;
    }
}