import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int numeros[] = new int[20];

        rellenaArray(numeros);

        colocarNumeros(numeros);

        System.out.println(java.util.Arrays.toString(numeros));
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
                pares = copyOf(pares, pares.length + 1);
                pares[pares.length - 1] = e;
            }
            else {
                impares = copyOf(impares, impares.length + 1);
                impares[impares.length - 1] = e;
            }
        }

        colocarParesEImpares(numeros, pares, impares);
    }

    private static void colocarParesEImpares(int numeros[], int pares[], int impares[]) {
        System.arraycopy(pares, 0, numeros, 0, pares.length);
        System.arraycopy(impares, 0, numeros, pares.length, numeros.length);
    }
}