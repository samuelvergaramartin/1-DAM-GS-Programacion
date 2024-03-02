/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadRefuerzo7 {
    public static void main(String[] args) {
        int inputValue;
        int inputArray[] = new int[2];
        int numberArray[] = new int[100];
        Scanner sc = new Scanner(System.in);
        
        numberArray = numberGenerator(numberArray);

        for(int i = 0; i < 2; i++) {
            System.out.print("Introduce un numero: ");
            inputValue = sc.nextInt();

            inputArray[i] = inputValue;
        }

        sc.close();

        showOcurrences(numberArray, inputArray);
    }
    static int[] numberGenerator(int[] t) {
        for(int i = 0; i < t.length; i++) {
            t[i] = (int) (Math.random() * 21 - 1);
        }

        return t;
    }
    static void showOcurrences(int[] t, int[] x) {
        boolean booleanArray[] = new boolean[t.length];
        String result;
        for(int i = 0; i < t.length; i++) {
            if(t[i] == x[0]) {
                booleanArray[i] = true;
                t[i] = x[1];
            }
            else {
                booleanArray[i] = false;
            }
        }
        result = customArrayBuilder(t, booleanArray);

        System.out.println(result);

    }
    static String customArrayBuilder(int[] intArray, boolean[] booleanArray) {
        String header, tail, body, result;
        header = "[ ";
        tail = " ]";
        body = "";

        for(int i = 0; i < intArray.length; i++) {
            if(booleanArray[i] == true) {
                body = body + " '" + intArray[i] + "'";
            }
            else {
                body = body + " " + intArray[i];
            }
        }

        result = header + body + tail;
        return result;
    }
}
