/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadPropuesta5P6 {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5,6,7,8,9,10};
        int result[];
        int number, indiceBorrado;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un numero a borrar: ");
        number = sc.nextInt();

        sc.close();

        indiceBorrado = Arrays.binarySearch(myArray, number);

        result = borrado(myArray, number, indiceBorrado);

        System.out.println(Arrays.toString(result));

    }
    static int[] borrado(int t[], int value, int index) {
        int temp[], result[];
        temp = new int[t.length];
        result = new int[t.length - 1];

        System.arraycopy(t, 0, temp, 0, index - 1);
        System.arraycopy(t, index + 1, temp, index, temp.length - 1);
        System.arraycopy(temp, 0, result, 0, result.length);

        return result;
    }
}
