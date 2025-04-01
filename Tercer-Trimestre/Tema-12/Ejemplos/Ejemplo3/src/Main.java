import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();

        lista.add(1);
        lista.add(5);
        lista.add(7);
        lista.add(4);
        lista.add(2);

        System.out.println(lista);

        //Muestro el elemento en la posicion 1
        System.out.println(lista.get(1));

        //Cambio el elemento en la posicion 1 por un 2
        System.out.println("Valor Original: " + lista.set(1, 2));
        System.out.println("Cambiamos el valor de la posicion 1\n" + lista);

        // Añdaimos en la posicion 2 el numero 3
        lista.add(2, 3);
        System.out.println("Añadimos el valor 3 en la posicion 2.");
        System.out.println(lista);

        // Añadimos una coleccion en la posicion 4

        ArrayList<Integer> lista2 = new ArrayList<>();

        lista2.add(-5);
        lista2.add(6);
        lista2.add(0);

        lista.addAll(4, lista2);

        System.out.println("Añadimos lista2 en lista");
        System.out.println(lista);

        //Borro el elemento en la posicion 2
        lista.remove(2);
        System.out.println(lista);

        //Borro el elemento 7
        lista.remove(Integer.valueOf(7));
        System.out.println(lista);

        //ordeno en orden inverso
        lista.sort(Comparator.reverseOrder());
        System.out.println(lista);
    }
}