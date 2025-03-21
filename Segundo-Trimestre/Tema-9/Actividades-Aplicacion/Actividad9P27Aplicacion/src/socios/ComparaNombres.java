package socios;

import java.util.Comparator;

public class ComparaNombres implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Socio s1 = (Socio) o1, s2 = (Socio) o2;

        return s1.getNombre().compareTo(s2.getNombre());
    }
}