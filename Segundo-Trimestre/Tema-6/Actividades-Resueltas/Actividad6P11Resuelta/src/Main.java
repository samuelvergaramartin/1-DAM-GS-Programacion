import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.print("Introduzca una palabra: ");
        palabra = sc.next();

        palabra = palabra.toLowerCase();
        palabra = codificar(palabra);

        System.out.println(palabra);
    }

    private static String codificar(String palabra) {
        final char[] conjunto1 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'},
        conjunto2 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        palabra = codifica(conjunto1, conjunto2, palabra.charAt(0)) + palabra.substring(1);

        for(int i = 1; i < palabra.length() - 1; i++) {
            palabra = palabra.substring(0, i) + codifica(conjunto1, conjunto2, palabra.charAt(i)) + palabra.substring(i+1);
        }

        palabra = palabra.substring(0, palabra.length() - 1) + codifica(conjunto1, conjunto2, palabra.charAt(palabra.length() - 1));

        return palabra;
    }

    private static char codifica(char conjunto1[], char conjunto2[], char c) {
        boolean codificado = false;
        int i = 0;

        while (i < conjunto1.length && !codificado) {
            if(conjunto1[i] == c) {
                c = conjunto2[i];
                codificado = true;
            }

            i++;
        }

        return c;
    }
}