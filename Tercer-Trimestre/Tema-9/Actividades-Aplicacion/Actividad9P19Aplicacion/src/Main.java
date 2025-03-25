
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Socio socios[] = {new Socio(1, "Pepito", "10-10-2001"), new Socio(2, "Pedro", "10-10-2020")};
        Comparator c = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                return ((Socio) o1).compareTo(o2);
            }
        };

        System.out.println("Array de Socios sin ordenar");

        System.out.println(Arrays.toString(socios));

        System.out.println("Array de socios ordenador por edad de menor a mayor");


        Arrays.sort(socios);
        //Arrays.sort(socios, c);

        System.out.println(Arrays.toString(socios));
    }
}