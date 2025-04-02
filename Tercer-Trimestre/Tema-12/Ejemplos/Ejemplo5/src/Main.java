import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> conjunto = new LinkedHashSet<>();
        conjunto.add(6);
        conjunto.add(1);
        conjunto.add(8);
        conjunto.add(3);
        System.out.println(conjunto);

        //Ordenamos usando un treeset y añadiendo una coleccion
        Set<Integer> ordenado = new TreeSet<>();
        ordenado.addAll(conjunto);
        System.out.println(ordenado);

        //Ordenamos usando un TreeSet y pasando la colección al constructor
        Set<Integer> ordenado2 = new TreeSet<>(conjunto);
        System.out.println(ordenado2);
    }
}