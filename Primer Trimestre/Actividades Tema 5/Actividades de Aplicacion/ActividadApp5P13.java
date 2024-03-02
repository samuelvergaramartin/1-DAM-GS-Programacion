/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class ActividadApp5P13 {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        myArray = tableGeneratorSorted(myArray);
        desordenar(myArray);
    }
    static void desordenar(int[] t) {
        int copy[] = new int[t.length];
        int nullArray[] = new int[10];
        int result[] = new int[t.length];
        System.arraycopy(t, 0, result, 0, result.length);
        System.arraycopy(result, 0, copy, 0, copy.length);
        for(int i = 0; i < result.length; i++) {
            result[i] = 0;
        }
        result[(int) (Math.random() * 10 + 1)] = copy[0];
        copy[0] = 0;
        int x = (int) (Math.random() * 10 + 1);
        result[0] = copy[x];
        copy[x] = 0;
        while(Arrays.equals(result, nullArray) == false) {
            int pos1,pos2;
            pos1 = (int) (Math.random() * 10 + 1);
            pos2 = (int) (Math.random() * 10 + 1);
            if(result[pos1] == 0 && copy[pos2] != 0) {
                result[pos1] = copy[pos2];
                copy[pos2] = 0;
            }
        }
        System.out.println(Arrays.toString(result));
    }
    static int[] tableGeneratorSorted(int[] table) {
        for(int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(table);
        return table;
    }
}
