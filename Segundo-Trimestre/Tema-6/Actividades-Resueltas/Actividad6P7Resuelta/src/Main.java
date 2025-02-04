import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabra;
        int numVeces;

        System.out.print("Introduzca una frase: ");
        frase = sc.nextLine();

        System.out.print("Introduzca una palabra: ");
        palabra = sc.nextLine();

        numVeces = contarPalabrasEnLaFrase(frase, palabra);

        System.out.println("La palabra " + palabra + " sale " + numVeces + " veces en la frase.");
    }

    static int contarPalabrasEnLaFrase(String frase, String palabra) {
        final String cadena[] = frase.split(" ");
        int resultado = 0;

        for(String e : cadena) {
            if(e.equals(palabra)) resultado++;
        }

        return resultado;
    }
}