package ejercicio7p13;
import static netcat_utils.Colors.CYAN;
import static netcat_utils.NetCatConsole.printSeparator;
/**
 *
 * @author Samuel Vergara Martín
 */
public class Ejercicio7P13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila pila = new Pila();
        Integer array[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        pila.apilarTodo(array);
        printSeparator();
        Integer numerito = pila.extraerYObtenerNumeroPorPosicion(3);
        printSeparator();
        System.out.println(CYAN +  "Numero extraido: " + numerito);
        printSeparator();
    }
    
}
