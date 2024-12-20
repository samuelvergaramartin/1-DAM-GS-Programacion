import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tabla[] = {12,5,3,13,2,9,7};

        ordenacionPorInserccion(tabla);

        System.out.println(Arrays.toString(tabla));
    }

    private static void ordenacionPorInserccion(int t[]) {
        int aux, x;
        for(int i = 1; i < t.length; i++) {
            x = i;
            while(x > 0 && t[x] < t[x-1]) {
                aux = t[x];
                t[x] = t[x-1];
                t[x-1] = aux;

                x--;
            }
        }
    }
}