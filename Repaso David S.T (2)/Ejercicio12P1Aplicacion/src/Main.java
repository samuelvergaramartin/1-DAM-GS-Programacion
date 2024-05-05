import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer t1[] = {1,2,3,4,5}, t2[] = {6,7,8,9,10}, tResult[];
        tResult = concatenar(t1, t2);
        System.out.println(Arrays.toString(tResult));
    }
    static <T> T[] concatenar(T[] table1, T[] table2) {
        int l = table1.length;
        table1 = Arrays.copyOf(table1, table1.length + table2.length);
        System.arraycopy(table2, 0, table1, l, table2.length);

        return table1;
    }
}