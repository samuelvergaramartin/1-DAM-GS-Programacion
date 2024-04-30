import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer t1[] = {1,2,3,4,5};
        Integer t2[] = {6,7,8,9,10};
        System.out.println(Arrays.toString(concatenar(t1, t2)));
    }

    static <T> T[] concatenar(T tabla1[], T tabla2[]) {
        T resultado[] = Arrays.copyOf(tabla1, tabla2.length + tabla1.length);
        System.arraycopy(tabla1, 0, resultado, 0, tabla1.length);
        System.arraycopy(tabla2, 0, resultado, tabla1.length, tabla2.length);

        return resultado;
    }
}