/**
 * @author Samuel Vergara Martín
 */
import java.util.Arrays;
public class ActividadApp5P12 {
    public static void main(String[] args) {
        int myArray[] = new int[10];
        myArray = tableGeneratorSorted(myArray);
        desordenar(myArray);
    }
    static void desordenar(int[] t) {
        int copy[] = new int[t.length];
        int nullArray[] = new int[10];
        System.arraycopy(t, 0, copy, 0, copy.length);
        for(int i = 0; i < t.length; i++) {
            t[i] = 0;
        }
        t[(int) (Math.random() * 10 + 1)] = copy[0];
        copy[0] = 0;
        int x = (int) (Math.random() * 10 + 1);
        t[0] = copy[x];
        copy[x] = 0;
        while(Arrays.equals(t, nullArray) == false) {
            int pos1,pos2;
            pos1 = (int) (Math.random() * 10 + 1);
            pos2 = (int) (Math.random() * 10 + 1);
            if(t[pos1] == 0 && copy[pos2] != 0) {
                t[pos1] = copy[pos2];
                copy[pos2] = 0;
            }
        }
        System.out.println(Arrays.toString(t));
    }
    static int[] tableGeneratorSorted(int[] table) {
        for(int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 100 + 1);
        }
        Arrays.sort(table);
        return table;
    }
}
