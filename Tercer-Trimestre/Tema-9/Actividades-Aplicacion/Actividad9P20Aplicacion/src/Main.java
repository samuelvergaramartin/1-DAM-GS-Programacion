import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {
                new Socio(1, "Pepito", "10-10-2001"),
                new Socio(3, "Pedro", "10-10-2020"),
                new Socio(2, "Pablo", "10-10-2001")
        };
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                int resultado;
                Socio s1 = (Socio) o1, s2 = (Socio) o2;
                if(s1.edad() == s2.edad()) {
                    resultado = s1.getID() - s2.getID();
                }
                else resultado = s1.getID() - s2.getID();

                return resultado;
            }
        };

        System.out.println("Array sin ordenar");

        System.out.println(Arrays.toString(socios));

        System.out.println("Array ordenado");

        Arrays.sort(socios, c);

        System.out.println(Arrays.toString(socios));
    }
}