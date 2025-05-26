package principal;

import monedas.Moneda;
import tipos.TiposMoneda;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int alea, alea2;
        Moneda moneda = null;
        ArrayList<Moneda> monedas = new ArrayList<>();

        for(int i = 0; i < 6; i++) {
            alea = (int)(Math.random()*2) +1;
            alea2 = (int)(Math.random()*8) +1;

            switch(alea2){
                case 1: {
                    moneda = new Moneda(TiposMoneda.UN_CENTIMO);
                    break;
                }
                case 2: {
                    moneda = new Moneda(TiposMoneda.DOS_CENTIMOS);
                    break;
                }
                case 3: {
                    moneda = new Moneda(TiposMoneda.CINCO_CENTIMOS);
                    break;
                }
                case 4: {
                    moneda = new Moneda(TiposMoneda.DIEZ_CENTIMOS);
                    break;
                }
                case 5: {
                    moneda = new Moneda(TiposMoneda.VEINTE_CENTIMOS);
                    break;
                }
                case 6: {
                    moneda = new Moneda(TiposMoneda.CINCUENTA_CENTIMOS);
                    break;
                }
                case 7: {
                    moneda = new Moneda(TiposMoneda.UN_EURO);
                    break;
                }
                case 8: {
                    moneda = new Moneda(TiposMoneda.DOS_EUROS);
                    break;
                }
            }

            if(moneda != null){
                if(alea == 1) moneda.setPosicion("Cara");
                else moneda.setPosicion("Cruz");
            }

            monedas.add(moneda);
        }

        for(Moneda m : monedas){
            System.out.println(m.getTipo() + " - " + m.getPosicion());
        }
    }
}