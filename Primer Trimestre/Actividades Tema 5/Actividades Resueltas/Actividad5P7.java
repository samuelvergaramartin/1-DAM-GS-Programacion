/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class Actividad5P7 {
    public static void main(String[] args) {
        int numeros[] = {1,2,4,5,2,7,1,8,8,3,2,9};
        int resultado[] = sinRepetidos(numeros);
        int resultadoOrdenado[] = sinRepetidosOrdenado(numeros);

        System.out.println(Arrays.toString(resultado));
        System.out.println(Arrays.toString(resultadoOrdenado));

    }
    static int[] sinRepetidos(int[] t) {
        int temp[] = new int[0];

        for (int elemento : t) {
            if(Arrays.binarySearch(temp, elemento) < 0 ) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = elemento;
            }
        }

        return temp;
    }
    static int[] sinRepetidosOrdenado(int[] t) {
        int temp[] = new int[0];

        for (int elemento : t) {
            if(Arrays.binarySearch(temp, elemento) < 0 ) {
                temp = Arrays.copyOf(temp, temp.length + 1);
                temp[temp.length - 1] = elemento;
            }
        }
        Arrays.sort(temp);
        return temp;
    }
}
