package ejercicio8p11aplicacion;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Campana extends Instrumento{
    Campana() {
        super();
    }
    @Override
    void interpretar() {
        for(Nota nota: melodia) {
            switch(nota) {
                case SI: System.out.println(CYAN + "DIIING");
                break;
                case DO: System.out.println(CYAN + "DOONG");
                break;
            }
        }
    }
}
