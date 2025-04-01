import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Set<Integer> repetidos = new TreeSet<>(), noRepetidos = new TreeSet<>(), unicos = new TreeSet<>();

        for(int i = 0; i < 20; i++) {
            lista.add((int) ((Math.random() * 10) + 1));
        }

        System.out.println("Lista: " + lista);
        noRepetidos.addAll(lista);

        System.out.println("Conjunto de los no repetidos: " + noRepetidos);

        for(Integer e : noRepetidos) {
            lista.remove(e);
        }

        System.out.println("Conjunto de los repetidos: " + repetidos);

        repetidos.addAll(lista);

        unicos.addAll(noRepetidos);
        unicos.removeAll(repetidos);

        System.out.println("Elementos unicos: " + unicos);
    }
}