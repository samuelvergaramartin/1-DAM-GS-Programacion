import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[20];

        rellenaArray(numeros);
    }

    private static void rellenaArray(int numeros[]) {
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) ((Math.random() * 100));
        }
    }

    private static void colocarNumeros(int numeros[]) {
        int[] pares = new int[0], impares = new int[0];

        for(int e: numeros) {
            if(e % 2 == 0) {
                pares = Arrays.copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = e;
            }
            else {
                impares = Arrays.copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = e;
            }
        }


    }

    private static void colocarPares(int numeros[], int pares[]) {
        System.arraycopy(pares, 0, numeros, 0, pares.length);
    }

    private static void colocarImpares(int )
}