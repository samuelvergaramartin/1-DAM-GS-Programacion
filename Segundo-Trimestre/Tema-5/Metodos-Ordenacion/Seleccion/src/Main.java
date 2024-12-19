import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int tabla[] = {2,8,3,4,1,7};

        ordenarPorSeleccion(tabla);

        System.out.println(Arrays.toString(tabla));
    }

    private static void ordenarPorSeleccion(int t[]) {
        int pos, aux;
        for(int i = 0; i < t.length; i++) {
            pos = i;
            for(int x = i + 1; x < t.length; x++) {
                if(t[pos] > t[x]) pos = x;
            }
            if(t[i] > t[pos]) {
                aux = t[i];
                t[i] = t[pos];
                t[pos] = aux;
            }
        }
    }
}