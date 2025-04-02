import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<Integer> conjunto1 = new TreeSet<>(), conjunto2 = new TreeSet<>(), resultado;

        conjunto1.add(1);
        conjunto1.add(2);
        conjunto1.add(3);
        conjunto1.add(4);

        conjunto2.add(2);
        conjunto2.add(3);
        conjunto2.add(4);
        conjunto2.add(5);

        resultado = Coleccion.union(conjunto1, conjunto2);

        System.out.println(resultado);

        resultado = Coleccion.interseccion(conjunto1, conjunto2);

        System.out.println(resultado);
    }
}