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

        return resultado;
    }

    private static void quitarVocales(String cadena[]) {
        for(String e : cadena) {
            if(esVocal(e.toCharArray()[0])) {
                cadena = e.replace(e, "");
            }
        }
    }

    private static boolean esVocal(char caracter) {
        final char[] VOCALES = {'a','e','i','o','u'};
        boolean resultado = false;

        if(Arrays.binarySearch(VOCALES, Character.toLowerCase(caracter)) >= 0) resultado = true;

        return resultado;
    }

}