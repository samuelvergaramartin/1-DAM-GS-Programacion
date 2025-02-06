import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase, palabrasOrdenadas[];

        do {
            System.out.print("Introduce una frase: ");
            frase = sc.nextLine();
        }
        while (frase.isBlank());

        palabrasOrdenadas = obtenerPalabrasOrdenadas(frase);

        System.out.println(Arrays.toString(palabrasOrdenadas));
    }

    private static String[] obtenerPalabrasOrdenadas(String frase) {
        frase = frase.replaceAll(",", "");
        String palabras[] = frase.split(" ");
        Arrays.sort(palabras);

        return palabras;
    }
}