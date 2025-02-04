import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase;

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        if(esPalindromo(frase)) System.out.println("Es palíndromo");
        else System.out.println("No es palíndromo");
    }

    private static boolean esPalindromo(String frase) {
        boolean resultado = false;
        String fraseInvertida;

        frase = frase.toLowerCase();
        frase = quitarEspaciosEnBlanco(frase);
        frase = quitarTildes(frase);
        fraseInvertida = invertirFrase(frase);

        if(frase.equals(fraseInvertida)) resultado = true;

        return resultado;
    }

    private static String quitarEspaciosEnBlanco(String frase) {
        String cadena[] = frase.split(" "), resultado = "";

        for(String e : cadena) {
            resultado+=e;
        }

        return resultado;
    }

    private static String quitarTildes(String frase) {
        char cadena[] = frase.toCharArray();
        final char[] TILDES = {'á', 'é', 'í', 'ó', 'ú'}, VOCALES = {'a', 'e', 'i', 'o', 'u'};

        for(int i = 0; i < cadena.length; i++) {
            for(int x = 0, cambiado = 0; x < TILDES.length && cambiado == 0; x++) {
                if(TILDES[x] == cadena[i]) {
                    cadena[i] = VOCALES[x];
                    cambiado = 1;
                }
            }
        }

        return String.copyValueOf(cadena);
    }

    private static String invertirFrase(String frase) {
        String fraseInvertida = "";

        for(int i = frase.length() - 1; i >= 0; i--) {
            fraseInvertida+= frase.charAt(i);
        }

        return fraseInvertida;
    }
}