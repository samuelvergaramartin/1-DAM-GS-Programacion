import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);

        System.out.println(lista);

        lista.set(0, 5);

        System.out.println(lista);

        lista.add(2);

        System.out.println(lista);

        lista.add(1, 7);

        System.out.println(lista);

        System.out.println(lista.remove(1));

        System.out.println(lista);

        lista.clear();

        lista.add(1);
        lista.add(3);
        lista.add(2);

        System.out.println(lista);
        lista.sort(Comparator.naturalOrder());
        System.out.println(lista);
        lista.sort(Comparator.reverseOrder());
        System.out.println(lista);
    }
}