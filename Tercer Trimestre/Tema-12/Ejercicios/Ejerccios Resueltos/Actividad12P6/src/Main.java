import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Collection<Integer> coleccion = lista;
        Iterator<Integer> it;
        Integer n;

        for(int i = 0; i < 100; i++) {
            coleccion.add((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Colección antes de la eliminación");
        System.out.println(coleccion);

        it = coleccion.iterator();
        while(it.hasNext()) {
            n = it.next();
            if(n == 5) it.remove();
        }

        System.out.println("Colección después de la eliminación");
        System.out.println(coleccion);
    }
}