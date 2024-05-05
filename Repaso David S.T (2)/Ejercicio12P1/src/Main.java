import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer tabla[] = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(tabla));
        tabla = insertToEndTable(tabla, 11);
        System.out.println(Arrays.toString(tabla));
    }
    static <T> T[] insertToEndTable(T[] table,T value) {
        table = Arrays.copyOf(table, table.length + 1);
        table[table.length - 1] = value;

        return table;
    }
}