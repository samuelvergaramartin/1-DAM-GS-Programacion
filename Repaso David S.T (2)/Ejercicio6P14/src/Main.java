import java.util.Scanner;

/**
 * @author Samuel Vergara Martín
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palabraOriginal, palabraAlterada, input;

        do {
            System.out.print("Judador 1: Introduce una palabra: ");
            input = sc.next();
        }
        while(input.isEmpty());
        palabraOriginal = input;
        input = null;

        do {
            palabraAlterada = alterarPalabra(palabraOriginal);
            System.out.println("Jugador 2: Pista: " + palabraAlterada);
            System.out.print("Introduzca la palabra original: ");
            input = sc.next();
        }
        while(!input.equals(palabraOriginal));

        System.out.println("Has acertado!! La palabra original es " + palabraOriginal);
    }
    static String alterarPalabra(String word) {
        char anagrama[] = word.toCharArray();

        for(int numCambios = 0; numCambios < anagrama.length; numCambios++) {
            int i = (int) (Math.random() * anagrama.length);
            int j = (int) (Math.random() * anagrama.length);
            char aux = anagrama[i];
            anagrama[i] = anagrama[j];
            anagrama[j] = aux;
        }

        return String.valueOf(anagrama);
    }
}