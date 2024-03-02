/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class Actividad5P10 {
    public static void main(String[] args) {
        int myArray[] = {10,2,3,4,5,6,7,8,1,9};
        int resultado[] = eliminarMayores(myArray, 8);

        System.out.println(Arrays.toString(resultado));
    }
    static int[] eliminarMayores(int t[], int value) {
        int temp[] = new int[t.length];
        int result[];
        int c = 0;

        for (int i : t) {
            if(i <= value) {
                temp[c] = i;
                c++;
            }
        }
        result = new int[c];
        System.arraycopy(temp, 0, result, 0, c);

        return result;
    }
}
