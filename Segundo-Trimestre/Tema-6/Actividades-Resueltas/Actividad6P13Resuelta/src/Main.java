import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, letras[][];

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();

        letras = contarLetras(frase.toLowerCase());
    }

    private static String[][] contarLetras(String frase) {
        String[][] letras;

        
    }
}