import java.util.Scanner;
import static java.util.Arrays.binarySearch;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.sort;
public class Main {
    public static void main(String[] args) {
        int numerosFavoritos[] = new int[0];
        Scanner sc = new Scanner(System.in);

        numerosFavoritos = obtenerNumerosFavoritos(numerosFavoritos, sc);
    }

    private static int[] procesoCalculoNumeroDeLaSuerte(int t[]) {
        int pos1, pos2, num1, num2;

        if(t.length <= 2) {
            if(t.length == 2) {
                
            }
        }
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