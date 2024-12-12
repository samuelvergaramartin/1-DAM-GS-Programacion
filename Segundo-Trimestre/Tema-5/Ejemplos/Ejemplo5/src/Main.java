import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] tabla = {-2,0,1,1,0,5};

        ordenar(tabla);

        System.out.println(Arrays.toString(tabla));
    }

    private static void ordenar(int tabla[]) {
        int minimo, temp;
        boolean hecho = false;
        for(int i = 0; i < tabla.length; i++) {
            minimo = minimo(tabla, i);

            for(int x = i; x < tabla.length; x++) {
                if(tabla[x] == minimo && !hecho) {
                    temp = tabla[i];
                    tabla[i] = minimo;
                    tabla[x] = temp;
                    hecho = true;
                }
            }

            hecho = false;
        }
    }

    private static int minimo(int tabla[], int posInicial) {
        int min = tabla[posInicial];

        for(int i = posInicial; i < tabla.length; i++) {
            min = Math.min(min, tabla[i]);
        }

        return min;
    }
}