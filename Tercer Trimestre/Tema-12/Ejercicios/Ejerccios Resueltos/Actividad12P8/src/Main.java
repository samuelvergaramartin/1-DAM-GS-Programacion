import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        Collection<Integer> coleccion = lista;
        ArrayList<Integer> copiaLista = new ArrayList<>();
        Collection<Integer> copiaColeccion = copiaLista;
        Integer array[];

        for(int i = 0; i < 20; i++) {
            coleccion.add((int) ((Math.random() * 100) + 1));
        }

        copiaColeccion.addAll(coleccion);

        array = (Integer[]) coleccion.toArray(new Integer[20]);
        coleccion.clear();

        System.out.println("En tabla sin ordenar");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Comparator.naturalOrder());

        System.out.println("En tabla ordenada");
        System.out.println(Arrays.toString(array));

        coleccion.addAll(Arrays.asList(array));
        array = null;

        System.out.println("Como colección de nuevo");
        System.out.println(coleccion);

        array = (Integer[]) copiaColeccion.toArray(new Integer[20]);
        copiaColeccion.clear();

        System.out.println("En tabla sin ordenar");
        System.out.println(Arrays.toString(array));

        Arrays.sort(array, Comparator.reverseOrder());

        System.out.println("En tabla ordenada de forma reversa");
        System.out.println(Arrays.toString(array));

        copiaColeccion.addAll(Arrays.asList(array));
        array = null;

        System.out.println("Como colección de nuevo");
        System.out.println(copiaColeccion);

    }
}