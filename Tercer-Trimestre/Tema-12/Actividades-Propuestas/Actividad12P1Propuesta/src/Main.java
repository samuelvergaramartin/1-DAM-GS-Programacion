import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer t1[] = {1,2,3}, t2[] = {4,5,6,7}, resultado[];

        resultado = concatena(t1, t2, new Integer[t1.length + t2.length]);

        System.out.println(Arrays.toString(resultado));
    }

    private static <T> T[] concatena(T[] tabla1, T[] tabla2, T[] tablaBaseResultado) {
        if(tablaBaseResultado.length == tabla1.length + tabla2.length) {
            System.arraycopy(tabla1, 0, tablaBaseResultado, 0, tabla1.length);
            System.arraycopy(tabla2, 0, tablaBaseResultado, tabla1.length, tabla2.length);
        }

        return tablaBaseResultado;
    }
}