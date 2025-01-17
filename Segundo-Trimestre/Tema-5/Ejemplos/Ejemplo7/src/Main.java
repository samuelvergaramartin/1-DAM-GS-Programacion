import static java.util.Arrays.deepToString;
public class Main {
    public static void main(String[] args) {
        int m[][] = new int[5][3];

        System.out.println("Filas: " + m.length);
        System.out.println("Columnas: " + m[0].length);

        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                m[i][j] = i;
            }
        }

        System.out.println(deepToString(m));

        System.out.println("-----------");

        for(int i = 0; i < m.length; i++) {
            System.out.println(java.util.Arrays.toString(m[i]));
        }

        System.out.println("-------------");

        for(int fila[] : m) {
            for(int elem : fila) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}