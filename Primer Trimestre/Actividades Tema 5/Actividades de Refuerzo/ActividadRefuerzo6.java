/**
 * @author Samuel Vergara Martín
*/
import java.util.*;
public class ActividadRefuerzo6 {
    public static void main(String[] args) {
        int inputValue;
        int numberArray[] = new int[15];
        int result[] = new int[15];
        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < 15; i++) {
            System.out.print("Introduce un numero: ");
            inputValue = sc.nextInt();

            numberArray[i] = inputValue;
        }

        sc.close();

        result = arrayRotation(numberArray);

        System.out.println(Arrays.toString(result));
    }
    static int[] arrayRotation(int[] t) {
        int result[] = new int[15];
        result[0] = t[t.length - 1];

        System.arraycopy(t, 0, result, 1, result.length - 1);

        return result;
    }
}