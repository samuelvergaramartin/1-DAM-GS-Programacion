import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String cadenas[] = new String[0];
        cadenas = guardar("Hola", cadenas);
        cadenas = guardar("que tal?", cadenas);

        System.out.println(Arrays.toString(cadenas));
    }

    static <E> E[] guardar(E elem, E[] a) {
        E aux[] = Arrays.copyOf(a, a.length + 1);
        aux[aux.length - 1] = elem;

        return aux;
    }
}