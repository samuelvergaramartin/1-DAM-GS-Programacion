import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> original = new ArrayList<>(), resultado;

        original.add(1);
        original.add(2);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(4);

        resultado = eliminaRepeticiones(original);

        System.out.println(resultado);
    }

    private static <T> List<T> eliminaRepeticiones(List<T> lista) {
        return new ArrayList<>(new LinkedHashSet<>(lista));
    }
}