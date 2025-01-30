import java.util.Scanner;
import static java.util.Arrays.copyOf;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabras[][] = new String[2][8];

        for(int i = 0; i < palabras[0].length; i++) {
            palabras[0][i] = ""+i;
            System.out.print("Introduce una palabra: ");
            palabras[1][i] = sc.nextLine();
        }

        colocarColoresYNoColores(palabras);

        for(int i = 0; i < palabras.length; i++) {
            for(int x = 0; x < palabras[i].length; x++) {
                System.out.print(palabras[i][x] + "\t");
            }
            System.out.println();
        }
    }

    private static void colocarColoresYNoColores(String palabras[][]) {
        String colores[] = new String[0], noColores[] = new String[0];

        for(String e : palabras[1]) {
            if(esColor(e)) colores = meterEnElArray(colores, e);
            else noColores = meterEnElArray(noColores, e);
        }

        System.arraycopy(colores, 0, palabras[1], 0, colores.length);
        System.arraycopy(noColores, 0, palabras[1], colores.length, noColores.length);
    }

    private static boolean esColor(String palabra) {
        final String[] COLORES = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};
        boolean resultado = false;

        for(int i = 0; i < COLORES.length && !resultado; i++) {
            if(COLORES[i].equals(palabra)) resultado = true;
        }

        return resultado;
    }

    private static String[] meterEnElArray(String array[], String elemento) {
        array = copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;

        return array;
    }
}