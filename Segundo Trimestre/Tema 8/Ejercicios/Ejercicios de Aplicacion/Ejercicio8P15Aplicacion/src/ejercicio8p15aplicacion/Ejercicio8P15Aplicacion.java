package ejercicio8p15aplicacion;
import static netcat_utils.Colors.CYAN;

/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio8P15Aplicacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String algo = "algo";
        boolean sonIguales;
        int result;
        Lista lista = new Lista();
        sonIguales = lista.equals(lista);
        if(sonIguales) result = 1;
        else result = 0;
        switch(result) {
            case 1: System.out.println(CYAN + "Ambas listas son iguales");
            break;
            case 0: System.out.println(CYAN + "Ambas listas no son iguales");
            break;
        }
    }
    
}
