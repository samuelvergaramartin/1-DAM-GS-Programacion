import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Iterator<Integer> it;

        it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

        lista.add(1);
        lista.add(2);

        it = lista.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}