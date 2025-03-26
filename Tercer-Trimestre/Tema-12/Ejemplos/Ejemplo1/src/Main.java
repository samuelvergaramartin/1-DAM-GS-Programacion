import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Integer numeros[] = {1,2,null,3,null};

        System.out.println(numNulos(numeros));
    }

    private static <E> int numNulos(E[] array) {
        int nulos = 0;

        for(E e : array) {
            if(e == null) nulos++;
        }

        return nulos;
    }
}