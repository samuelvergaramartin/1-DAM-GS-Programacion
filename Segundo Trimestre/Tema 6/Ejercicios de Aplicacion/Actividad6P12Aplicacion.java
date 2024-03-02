/**
 * @author Samuel Vergara Martín
 */
import java.util.Scanner;
public class Actividad6P12Aplicacion {
    public static void main(String[] args) {
        String palabraJugadorA, inputJugadorB;
        char palabraOriginal[], palabraResuelta[];
        Scanner sc = new Scanner(System.in);
        int cont = 0;

        System.out.print("Jugador A: Introduce una palabra: ");
        palabraJugadorA = sc.nextLine();

        palabraOriginal = palabraJugadorA.toCharArray();

        palabraResuelta = new char[palabraOriginal.length];

        for(int i = 0; i < palabraResuelta.length; i++) {
            palabraResuelta[i] = '_';
        }

        
    }
}