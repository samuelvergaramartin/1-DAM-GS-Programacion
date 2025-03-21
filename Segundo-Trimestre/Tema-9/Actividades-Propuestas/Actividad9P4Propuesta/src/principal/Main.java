package principal;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "A", "10-10-2010"),
                new Socio(2, "C", "10-10-2010"),
                new Socio(3, "B", "10-10-2010"),

        };
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                Socio s1 = (Socio) o1, s2 = (Socio) o2;

                return s1.getNombre().compareTo(s2.getNombre());
            }
        };

        System.out.println("Tabla sin ordenar");
        System.out.println(Arrays.toString(socios));
        System.out.println("Tabla ordenada por nombres alfabeticamente");
        Arrays.sort(socios, c);
        System.out.println(Arrays.toString(socios));
    }
}