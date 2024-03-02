/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P13 {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        int contador[];

        System.out.print("Introduce una frase: ");
        frase = sc.nextLine();
        frase = frase.toLowerCase();

        sc.close();

        contador = new int['z' - 'a' + 1];

        for(int i = 0; i < frase.length(); i++) {
            if(Character.isLetter(frase.charAt(i))) contador[frase.charAt(i) - 'a']++;
        }
        for(int i = 0; i < 'z' - 'a' + 1; i++) {
            if(contador[i] != 0) System.out.println((char) (i + 'a') + ": " + contador[i] + " veces.");
        }
    }
}
