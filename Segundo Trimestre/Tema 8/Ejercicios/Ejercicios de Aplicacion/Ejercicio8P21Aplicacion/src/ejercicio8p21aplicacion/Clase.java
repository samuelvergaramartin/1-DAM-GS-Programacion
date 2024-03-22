package ejercicio8p21aplicacion;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.Colors.RESET;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Clase {
    Clase(){};
    
    static boolean esNumero(Object ob) {
        if(ob instanceof Integer || ob instanceof Long 
        || ob instanceof Double || ob instanceof Float 
        || ob instanceof Byte || ob instanceof Short) return true;
        else return false;
    }
    
    boolean sumar(Object a, Object b) {
        if(a instanceof String && b instanceof String) {
            System.out.println(CYAN + a + b + RESET);
            return true;
        }
        else {
            boolean areNumbers = esNumero(a) && esNumero(b);
            if(areNumbers) {
                System.out.println(CYAN + "a + b = " + a + b + RESET);
            }
        }
    }
}
