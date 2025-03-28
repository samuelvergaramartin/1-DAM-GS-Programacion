import java.util.*;

public class Main {
    public static void main(String[] args) {
        List <Cliente> lista = new ArrayList<>();
        Cliente c1 = new Cliente("Pepe", "123");
        Cliente c2 = new Cliente("Pepe", "123");
        Cliente c3 = new Cliente("Claudia", "345");
        Cliente c4 = new Cliente("Mario", "654");

        lista.add(c1);
        lista.add(c3);
        lista.add(c4);

        System.out.println(lista);

        lista.remove(c4);

        System.out.println("Borro a Mario");
        System.out.println(lista);

        lista.clear();
        System.out.println("Borro el resto de los elementos con clear");
        System.out.println(lista);
        System.out.println("Lista vacia: " + lista.isEmpty());

        System.out.println("Vuelvo a meter los elementos");
        lista.add(c1);
        System.out.println("Tamaño: " + lista.size());
        System.out.println(lista);
        System.out.println("Lista vacia: " + lista.isEmpty());

        System.out.println("Contains Pepe: " + lista.contains(c2));

        //Creo otra lista de numeros enteros
        Collection<Integer> listaEnteros = new ArrayList<>();
        for(int i = 1; i <= 10; i++) {
            listaEnteros.add(i);
        }

        //Recorro la lista con un iterador
        Iterator<Integer> it = listaEnteros.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            System.out.print(num + " ");
        }

        //Reinicio el iterador
        it = listaEnteros.iterator();

        while (it.hasNext()) {
            Integer num = it.next();
            if(num %2 == 0) {
                it.remove();
            }
        }

        System.out.println();

        System.out.println(listaEnteros);

        //Recorro la lista con foreach
        for(Integer e: listaEnteros) {
            System.out.print(e + " ");
        }

        // Volvemos con los clientes
        lista.add(c2);
        lista.add(c3);
        lista.add(c4);

        System.out.println("\n");
        System.out.println(lista);
        //Creo otra lista

        Collection<Cliente> lista2 = new ArrayList<>();
        lista2.add(c1);
        lista2.add(c4);

        System.out.println("Lista 2");
        System.out.println(lista2);

        System.out.println("Contiene lista a lista 2: " + lista.containsAll(lista2));

        //Borro de lista a lista2
        lista.removeAll(lista2);

        System.out.println("Lista");
        System.out.println(lista);

        //Añado a Pepe a la lista
        lista.add(c1);
        System.out.println("Lista");
        System.out.println(lista);
        System.out.println("Contiene lista a lista 2: " + lista.containsAll(lista2));

        //Añado con addAll
        lista.addAll(lista2);
        System.out.println("Añado lista2 a lista");
        System.out.println(lista);

        //Borro con retainAll
        lista.retainAll(lista2);
        System.out.println("Borro con retain");
        System.out.println(lista);

        // Transformo mi lista en un array de objetos
        System.out.println("Array estatico");
        Object a1[] = lista.toArray();
        System.out.println(Arrays.toString(a1));

        //Transformo mi lista en un array de clientes
        Cliente a2[] = lista.toArray(new Cliente[0]);
        System.out.println("Array estatico de cliente");
        System.out.println(Arrays.toString(a2));

        // Transformo el array en una lista
        List<Cliente> listaC;

        listaC = Arrays.asList(a2);
        System.out.println("Lista a partir de array");
        System.out.println(listaC);
    }
}