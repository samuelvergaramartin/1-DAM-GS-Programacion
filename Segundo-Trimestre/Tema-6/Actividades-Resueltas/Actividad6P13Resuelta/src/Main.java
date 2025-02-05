import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, letras[][];

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        letras = contarLetras(frase.toLowerCase());

        System.out.println("Resultado: ");

        for(int i = 0; i < letras[0].length; i++) {
            if(!letras[1][i].equals("0")) {
                System.out.print(letras[0][i] + ": ");
                if(!letras[1][i].equals("1")) System.out.println(letras[1][i] + " veces");
                else System.out.println(letras[1][i] + " vez");
            }
        }
    }

    private static String[][] contarLetras(String frase) {
        String[][] letras = new String[0][0];
        int contador[], indice;
        String cadena[] = frase.split("");

        letras = prepararMatriz(letras);
        contador = new int[letras[1].length];

        for(String e : cadena) {
            if(Character.isLetter(e.charAt(0))) {
                indice = Arrays.binarySearch(letras[0], e);
                contador[indice]++;
                letras[1][indice] = String.valueOf(contador[indice]);
            }
        }

        return letras;
    }

    private static String[][] prepararMatriz(String[][] matriz) {
        String letras[] = new String[0];

        for(int i = Character.hashCode('a'); i <= Character.hashCode('n'); i++) {
            letras = meterEnElArray(letras, Character.toString((char) i));
        }

        letras = meterEnElArray(letras, "ñ");

        for(int i = Character.hashCode('o'); i <= Character.hashCode('z'); i++) {
            letras = meterEnElArray(letras, Character.toString((char) i));
        }

        matriz = new String[2][letras.length];

        System.arraycopy(letras, 0, matriz[0], 0, letras.length);
        Arrays.fill(matriz[1], "0");

        return matriz;
    }

    private static String[] meterEnElArray(String array[], String elemento) {
        array = Arrays.copyOf(array, array.length + 1);
        array[array.length - 1] = elemento;
        return array;
    }
}