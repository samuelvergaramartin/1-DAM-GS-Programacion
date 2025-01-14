import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;
public class Main {
    public static void main(String[] args) {
        int tabla[] = {1,2,3,4,5,6,7,8,9,10};
        tabla = eliminacionOrdenada(tabla, 4);

        System.out.println(java.util.Arrays.toString(tabla));
    }

    private static int[] eliminacionOrdenada(int t[], int elemento) {
        int indiceDeEliminacion = binarySearch(t, elemento);

        if(indiceDeEliminacion >= 0) {
            System.arraycopy(t, indiceDeEliminacion + 1, t, indiceDeEliminacion, t.length - indiceDeEliminacion - 1);
            t = copyOf(t, t.length - 1);
        }

        return t;
    }
}