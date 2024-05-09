import java.util.ArrayList;
import java.util.Collection;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Collection<Integer> coleccion = lista;
        ArrayList<Integer> listaCinco = new ArrayList<>();
        Collection<Integer> cinco = listaCinco;

        cinco.add(5);

        for(int i = 0; i < 100; i++) {
            coleccion.add((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Colección antes de la eliminación");
        System.out.println(lista);

        coleccion.removeAll(cinco);

        System.out.println("Colección despues de la eliminación");
        System.out.println(coleccion);
    }
}