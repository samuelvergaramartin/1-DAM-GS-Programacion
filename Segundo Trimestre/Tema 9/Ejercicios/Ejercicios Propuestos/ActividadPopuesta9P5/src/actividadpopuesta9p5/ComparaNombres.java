package actividadpopuesta9p5;

import java.util.Comparator;
/**
 *
 * @author Samuel Vergara Martín
 */
public class ComparaNombres implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
       return ((Socio) o1).nombre.compareTo(((Socio) o2).nombre);
    }
}
