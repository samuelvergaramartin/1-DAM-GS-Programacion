import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra1, palabra2;

        System.out.print("Introduce una palabra: ");
        palabra1 = sc.next();

        System.out.print("Introduce otra palabra: ");
        palabra2 = sc.next();

        if(sonAnagramas(palabra1, palabra2)) System.out.println("Son anagramas");
        else System.out.println("No son anagramas");
    }

    private static boolean sonAnagramas(String palabra1, String palabra2) {
        Object[][] letras;
        boolean resultado = false, modificado;

        if(palabra1.length() == palabra2.length()) {
            letras = new Object[2][palabra1.length()];

            System.arraycopy(palabra1.split(""), 0, letras[0], 0, letras[0].length);
            Arrays.fill(letras[1], false);

            for(int i = 0; i < palabra2.length(); i++) {
                modificado = false;
                for(int x = 0; x < letras[1].length && !modificado; x++) {
                    if(String.valueOf(palabra2.charAt(i)).equals(letras[0][x]) && letras[1][x].equals(false)) {
                        letras[1][x] = true;
                        modificado = true;
                    }
                }

            }

            resultado = !Arrays.toString(letras[1]).contains("false");
        }

        return resultado;
    }
}