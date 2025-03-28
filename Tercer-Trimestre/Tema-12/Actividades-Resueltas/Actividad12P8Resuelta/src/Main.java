import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> coleccion = new ArrayList<>();
        Integer[] array;

        for(int i = 0; i < 20; i++) {
            coleccion.add((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Colección sin ordenar: ");
        System.out.println(coleccion);

        array = coleccion.toArray(new Integer[0]);

        System.out.println("Ordenando de menor a mayor...");
        Arrays.sort(array);

        coleccion = Arrays.asList(array);

        System.out.println("Coleccion ordenada de menor a mayor: ");
        System.out.println(coleccion);

        array = coleccion.toArray(new Integer[0]);

        System.out.println("Ordenando de mayor a menor...");

        Arrays.sort(array, Comparator.reverseOrder());

        coleccion = Arrays.asList(array);

        System.out.println("Coleccion ordenada de mayor a menor: ");
        System.out.println(coleccion);
    }
}