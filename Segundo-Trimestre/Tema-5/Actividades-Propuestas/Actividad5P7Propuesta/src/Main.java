import java.util.Scanner;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;
public class Main {
    public static void main(String[] args) {
        int numerosFavoritos[] = new int[0];
        Scanner sc = new Scanner(System.in);

        numerosFavoritos = obtenerNumerosFavoritos(numerosFavoritos, sc);

        while (numerosFavoritos.length > 1) {
            numerosFavoritos = procesoCalculoNumeroDeLaSuerte(numerosFavoritos);
        }

        System.out.print("Tu numero de la suerte es: " + numerosFavoritos[0]);
    }

    private static int[] inserccionOrdenada(int t[], int elemento) {
        t = copyOf(t, t.length + 1);
        t[t.length - 1] = elemento;
        sort(t);

        return t;
    }

    private static int[] procesoCalculoNumeroDeLaSuerte(int t[]) {
        int pos1, pos2, resultado;

        if(t.length <= 2) {
            if(t.length == 2) {
                do {
                    pos1 = (int) (Math.random() * t.length);
                    pos2 = (int) (Math.random() * t.length);
                }
                while (pos1 == pos2);

                t = eliminacionOrdenada(t, t[pos2]);
            }
        }
        else {
            do {
                pos1 = (int) (Math.random() * t.length);
                pos2 = (int) (Math.random() * t.length);
            }
            while (pos1 == pos2);

            resultado = (int) Math.round((t[pos1] + t[pos2]) / 2.0);
            t = eliminacionOrdenada(t, t[pos1]);
            t = eliminacionOrdenada(t, t[pos2]);
            t = inserccionOrdenada(t, resultado);
        }

        return t;
    }

    private static int[] obtenerNumerosFavoritos(int t[], Scanner sc) {
        int numero;

        System.out.println("Tus numeros favoritos:");
        System.out.print("Introduce un numero: ");
        numero = sc.nextInt();

        while (numero != -1) {
            t = copyOf(t, t.length + 1);
            t[t.length - 1] = numero;

            System.out.print("Introduce un numero: ");
            numero = sc.nextInt();
        }
        sort(t);

        return t;
    }

    private static int[] eliminacionOrdenada(int t[], int elemento) {
        int indiceDeEliminacion = binarySearch(t, elemento);

        if(indiceDeEliminacion >= 0) {
            System.arraycopy(t, indiceDeEliminacion + 1, t, indiceDeEliminacion, t.length - indiceDeEliminacion - 1);
            t = copyOf(t, t.length - 1);
        }

        return t;
    }
}