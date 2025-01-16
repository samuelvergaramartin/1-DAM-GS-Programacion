import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        int dorsales[] = new int[0], menoresDeEdad[] = new int[0];
        Scanner sc = new Scanner(System.in);

        dorsales = registrarDorsales(dorsales, sc);
    }

    private static int[] registrarDorsales(int t[], Scanner sc) {
        int dorsal;

        System.out.print("Introduce el dorsal del juegador: ");
        dorsal = sc.nextInt();

        while (dorsal != -1) {
            t = copyOf(t, t.length + 1);
            t[t.length - 1] = dorsal;
            System.out.print("Introduce el dorsal del juegador: ");
            dorsal = sc.nextInt();
        }

        return t;
    }

    private static int[] eliminacion(int t[], int elemento) {
        int posElemento = -1;

        for(int i = 0; (i < t.length) && (posElemento == -1); i++) {
            if(t[i] == elemento) posElemento = i;
        }

        if(posElemento != -1) {
            System.arraycopy(t, posElemento + 1, t, posElemento, (t.length - posElemento - 1));
            t = copyOf(t, t.length - 1);
        }

        return t;
    }
}