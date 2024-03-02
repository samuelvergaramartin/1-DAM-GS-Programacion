/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class Actividad5P12 {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];

        for(int x = 0; x < matrix.length; x++) {
            for(int y = 0; y < matrix[x].length; y++) {
                matrix[y][x] = 10 * x + y;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
