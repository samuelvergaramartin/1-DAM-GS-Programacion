/**
 * @author Samuel Vergara Martín
 */
import java.util.*;
public class ActividadApp5P11 {
    public static void main(String[] args) {
        int inputValue;
        int table[] = new int[10];
        int result[] = new int[10];
        Scanner sc = new Scanner(System.in);

        table = tableGenerator(table);

        System.out.print("Introduce un numero a buscar en la tabla: ");
        inputValue = sc.nextInt();

        sc.close();

        result = buscarTodos(table, inputValue);

        System.out.println(Arrays.toString(result));
    }
    static int[] buscarTodos(int[] t, int clave) {
        int c = 0;
        for (int i : t) {
            if(i != clave) t[c] = 0;
            c++;
        }

        return t;
    }
    static int[] tableGenerator(int[] table) {
        for(int i = 0; i < table.length; i++) {
            table[i] = (int) (Math.random() * 10 + 1);
        }
        
        return table;
    }
}