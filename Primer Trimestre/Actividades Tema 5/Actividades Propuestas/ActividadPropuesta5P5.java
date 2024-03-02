/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class ActividadPropuesta5P5 {
    public static void main(String[] args) {
        int myArray[] = {1,2,3,4,5,6,7,9,10}, newNumber = 8, insertionIndex = Arrays.binarySearch(myArray, newNumber);

        if(insertionIndex < 0) {
            insertionIndex = - insertionIndex - 1;
        }

        int copy[] = new int[myArray.length + 1];
        System.arraycopy(myArray, 0, copy, 0, insertionIndex);
        System.arraycopy(myArray, insertionIndex, copy, insertionIndex+1, myArray.length - insertionIndex);

        copy[insertionIndex] = newNumber;
        myArray = copy;

        System.out.println(Arrays.toString(myArray));
    }
}
