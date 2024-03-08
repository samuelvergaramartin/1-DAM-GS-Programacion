package ejercicio8p5;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Piano extends Instrumento{
    Piano() {
        super();
    }
    @Override
    public void interpretar() {
        for(Nota nota: melodia) {
            switch(nota) {
                case DO: System.out.println(CYAN + "DO");
                break;
                case RE: System.out.println(CYAN + "RE");
                break;
                case MI: System.out.println(CYAN + "MI");
                break;
                case FA: System.out.println(CYAN + "FA");
                break;
                case SOL: System.out.println(CYAN + "SOL");
                break;
                case LA: System.out.println(CYAN + "LA");
                break;
                case SI: System.out.println(CYAN + "SI");
                break;
            }
        }
    }
}
