import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> c1 = new ArrayList<>();
        Iterator<Integer> it;

        for(int i = 0; i < 100; i++) {
            c1.add((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Mostrando lista antes de la eliminacion de los 5");
        System.out.println(c1);

        it = c1.iterator();

        while (it.hasNext()) {
            if(it.next().equals(5)) it.remove();
        }

        System.out.println("Mostrando lista después de la eliminacion de los 5");
        System.out.println(c1);
    }
}