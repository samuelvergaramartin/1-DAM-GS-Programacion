import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Object o;
        Cliente c = new Cliente("1", "Pepe");

        o = c;

        Contenedor<?> co;
        Contenedor<Integer> ci = new Contenedor<>();

        co = ci;
    }
}