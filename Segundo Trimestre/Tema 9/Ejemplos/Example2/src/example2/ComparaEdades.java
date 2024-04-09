package example2;

import java.util.Comparator;

/**
 *
 * @author Samuel Vergara Martín
 */
public class ComparaEdades implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int edad1 = ((Socio) o1).edad();
        int edad2 = ((Socio) o2).edad();
        
        return edad2;
    }
}
