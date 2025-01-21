import static java.util.Arrays.sort;
public class Main {
    public static void main(String[] args) {
        int tabla1[] = {1,2,3,4,5,6,7,8,9}, tabla2[] = {10,11,12,13,14,15,16,17,18,19}, tabla3[];

        tabla3 = fusionOrdenada(tabla1, tabla2);

        System.out.println(java.util.Arrays.toString(tabla3));
    }

    private static int[] fusionOrdenada(int tabla1[], int tabla2[]) {
        int tabla3[] = new int[tabla1.length + tabla2.length];
        System.arraycopy(tabla1, 0, tabla3, 0, tabla1.length);
        System.arraycopy(tabla2, 0, tabla3, tabla1.length , tabla2.length);

        sort(tabla3);

        return tabla3;
    }
}