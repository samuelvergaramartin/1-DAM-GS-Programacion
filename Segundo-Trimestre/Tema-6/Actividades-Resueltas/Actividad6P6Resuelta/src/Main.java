import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreModificado;

        System.out.print("Itroduzca su nombre completo: ");

        nombreModificado = quitarVocalesYAcentos(sc.nextLine().split(""));

        System.out.println(nombreModificado);
    }

    public static String quitarVocalesYAcentos(String cadena[]) {
        String resultado = "";

        quitarVocales(cadena);
        quitarAcentos(cadena);

        for(String e : cadena) {
            resultado+= e;
        }

        return resultado;
    }

    private static void quitarVocales(String cadena[]) {
        for(int i = 0; i < cadena.length; i++) {
            if(esVocal(cadena[i].toLowerCase().toCharArray()[0])) {
                cadena[i] = " ";
            }
        }
    }

    private static void quitarAcentos(String cadena[]) {
        System.out.println(Arrays.toString(cadena));
        char algo;
        for(int i = 0; i < cadena.length; i++) {
            algo = cadena[i].toLowerCase().toCharArray()[0];
            if(tieneAcento(algo)) {
                cadena[i] = "";
            }
        }
    }

    private static boolean tieneAcento(char caracter) {
        final char[] ACENTOS = {'á', 'é', 'í', 'ó', 'ú'};

        boolean resultado = false;

        if(Arrays.binarySearch(ACENTOS, Character.toLowerCase(caracter)) >= 0) resultado = true;

        return resultado;
    }

    private static boolean esVocal(char caracter) {
        final char[] VOCALES = {'a','e','i','o','u'};
        boolean resultado = false;

        if(Arrays.binarySearch(VOCALES, Character.toLowerCase(caracter)) >= 0) resultado = true;

        return resultado;
    }

}