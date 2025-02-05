import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabra;

        System.out.print("Introduzca una palabra codificada: ");
        palabra = sc.next();

        palabra = palabra.toLowerCase();
        palabra = descodificar(palabra);

        System.out.println("Palabra descodificada: " + palabra);
    }

    private static String descodificar(String palabra) {
        final char[] conjunto2 = {'e', 'i', 'k', 'm', 'p', 'q', 'r', 's', 't', 'u', 'v'},
        conjunto1 = {'p', 'v', 'i', 'u', 'm', 't', 'e', 'r', 'k', 'q', 's'};

        palabra = descodifica(conjunto1, conjunto2, palabra.charAt(0)) + palabra.substring(1);

        for(int i = 1; i < palabra.length() - 1; i++) {
            palabra = palabra.substring(0, i) + descodifica(conjunto1, conjunto2, palabra.charAt(i)) + palabra.substring(i+1);
        }

        palabra = palabra.substring(0, palabra.length() - 1) + descodifica(conjunto1, conjunto2, palabra.charAt(palabra.length() - 1));

        return palabra;
    }

    private static char descodifica(char conjunto1[], char conjunto2[], char c) {
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