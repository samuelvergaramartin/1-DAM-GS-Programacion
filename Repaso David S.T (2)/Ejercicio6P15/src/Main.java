import java.util.Arrays;
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
            System.out.println(mostrarIguales(palabraOriginal,input));
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
    static String mostrarIguales(String palabraOriginal, String palabraIntroducida) {
        char original[] = palabraOriginal.toCharArray();
        char introducida[] = palabraIntroducida.toCharArray();
        String result = "";

        if(original.length != introducida.length) {
            if(original.length > introducida.length) {
                int n = original.length - introducida.length;
                introducida = Arrays.copyOf(introducida, introducida.length + n);
            }
            else {
                int n = introducida.length - original.length;
                introducida = Arrays.copyOf(introducida, introducida.length - n);
            }
        }

        for(int i = 0; i < original.length; i++) {
            if(introducida[i] == original[i]) result+= original[i];
            else result+= "*";
        }

        return result;
    }
}