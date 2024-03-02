package ejercicio7p11;
import static netcat_utils.Colors.CYAN;
/**
 *
 * @author Smauel Vergara Martin
 */
public class Ejercicio7P11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista lista = new Lista();
        int totalElementos;
        Integer elemento;
        
        Integer otherList[] = { 23, 45, 76, 12, 88 };
        
        lista.setNumberToStartList(45);
        
        lista.showAllElements();
        
        lista.setNumberToEndList(76);
        
        lista.showAllElements();
        
        totalElementos = lista.getTotalElementos();
        
        System.out.println(CYAN + totalElementos);
        
        lista.insertNumberToListByIndex(34, 1);
        
        lista.showAllElements();
        
        lista.deleteElementForTableByIndex(1);
        
        lista.showAllElements();
        
        lista.searchElementInTable(45);
        
        lista.searchElementInTable(999);
        
        lista.insertOtherTableToEndList(otherList);
        
        lista.showAllElements();
        
        elemento = lista.getElementFromTableByIndex(0);
        
        System.out.println(CYAN + elemento);
    }
    
}
