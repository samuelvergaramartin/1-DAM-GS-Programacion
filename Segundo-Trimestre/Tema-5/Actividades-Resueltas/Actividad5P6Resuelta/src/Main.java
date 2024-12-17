import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] primitiva = new int[6], combinacionGanadora = new int[6];

        rellenar(primitiva);
        rellenar(combinacionGanadora);

        System.out.println(obtenerNumeroAciertos(primitiva, combinacionGanadora));
    }

    private static int obtenerNumeroAciertos(int primitiva[], int combinacionGanadora[]) {
        int resultado = 0;

        for(int e : primitiva) {
            if(Arrays.binarySearch(combinacionGanadora, e) >= 0) resultado++;
        }

        return resultado;
    }

    private static void rellenar(int t[]) {
        for(int i = 0; i < t.length; i++) {
            t[i] = (int) ((Math.random()) * 10);
        }
    }
}