import java.util.Set;
import java.util.TreeSet;

public abstract class Coleccion {
    public static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new TreeSet<>(conjunto1);
        resultado.addAll(conjunto2);

        return resultado;
    }

    public static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> resultado = new TreeSet<>(conjunto1);
        resultado.retainAll(conjunto2);

        return resultado;
    }
}
