import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer tabla[] = new Integer[0];

        tabla = insertar(1, tabla);
        System.out.println(Arrays.toString(tabla));
        tabla = insertar(2, tabla);
        System.out.println(Arrays.toString(tabla));
    }

    private static <T> T[] insertar(T elemento, T[] tabla) {
        tabla = Arrays.copyOf(tabla, tabla.length + 1);
        tabla[tabla.length - 1] = elemento;
        return tabla;
    }
}