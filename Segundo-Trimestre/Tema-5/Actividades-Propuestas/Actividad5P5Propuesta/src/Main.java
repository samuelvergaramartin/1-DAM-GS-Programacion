import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int numeros[] = {1,2,3,5,6,7};

        numeros = inserccionOrdenada(4, numeros);

        System.out.println(java.util.Arrays.toString(numeros));
    }

    private static int[] inserccionOrdenada(int num, int t[]) {
        int pos = (Math.abs(binarySearch(t, num))-1), resultado[] = new int[pos -1], diferencia;
        System.arraycopy(t, 0, resultado, 0, pos);
        resultado = copyOf(resultado, resultado.length + 1);
        resultado[resultado.length - 1] = num;
        diferencia = t.length - resultado.length;
        resultado = copyOf(resultado, t.length);
        System.arraycopy(t, pos, resultado, pos, diferencia);

        return resultado;
    }
}